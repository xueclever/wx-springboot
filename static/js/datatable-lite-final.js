/**
 * ShowPage 1.9.0
 * Created by ShiNez on 2016/11/21.
 * Updated at 2017/04/08
 * 仅支持：pagehelper 请自行添加依赖
 */
var DataTable = function () {
    var url;
    var page;
    var params;
    var table;
    var modal;
    var multiple;
    var columNum;
    var columns;
    var options;
    var handles;
    var endFn;
    var endFnOnce;
    var endFnOnceFlag = true;
    var tableMethod;
    var checkedIds = [];
    var authValid = false;


    var convertDataValue = function (convertRole, fieldValue) {
        //     fieldValue=fieldValue+"";
        //     if(!isNaN(fieldValue)){
        //         fieldValue=parseInt(fieldValue);
        //     }
        if (fieldValue == "true") fieldValue = 1;
        if (fieldValue == "false") fieldValue = 0;
        var roleArray = convertRole.split("|");
        var currentRoleArray;
        var showValue;
        $.each(roleArray, function (k, v) {
            currentRoleArray = v.split("=>");
            if (fieldValue == currentRoleArray[0]) {
                showValue = currentRoleArray[1];
                return false;
            }
        });
        return showValue;
    };
    //构建行
    var buildRow = function (dataIndex, dataId, getFieldValue) {
        var tr = $("<tr data-id='" + dataId + "' ></tr>");

        if (multiple === true) {
            $(tr).append("<td><label class='mt-checkbox'><input class='no-init' type='checkbox'  onclick='DataTable.checkParent(event)'  value='" + dataId + "'><span><span></span></span></label></td>");
        }
        $.each(columns, function (k, v) {
            var td = $("<td style='vertical-align: middle' data-name='" + v.data + "'></td>");
            var fieldValue = getFieldValue(v);
            fieldValue = fieldValue == null ? "" : fieldValue;
            $(td).attr("data-value", fieldValue);
            var showValue = fieldValue;
            if (showValue.length == 0) {
                showValue = showValue == "" ? "-" : showValue;
            }

            if (v.replaceFn != null && v.replaceFn != "") {
                $(td).attr("data-fn", v.replaceFn);
                showValue = convertVal(v.replaceFn, fieldValue);
            }

            if (v.convert != null && v.convert != "") {
                $(td).attr("data-convert", v.convert);
                showValue = convertDataValue(v.convert, fieldValue);

            }

            $(td).attr("data-type", v.type == null ? 'text' : v.type);
            if (v.type == "img" && v.visible != false) {
                if (showValue == "-") showValue = "";
                $(td).html("").append("<img style='width:50px;height:50px;' src='" + showValue + "' alt=''>");
                if (v.view != null && v.view != "") {
                    $(td).attr("title", "点击可预览").unbind("click").on("click", function () {
                        $("#" + v.view).modal("show").css("z-index", 99999).find("img").attr("src", fieldValue);
                    });
                }
            } else if (v.type == "date") {
                var timestamp = showValue;
                var dateStr = "";
                if (timestamp != null && timestamp != "" && timestamp != "-") {
                    var d = new Date(timestamp);    //根据时间戳生成的时间对象
                    dateStr = (d.getFullYear()) + "-" +
                        (d.getMonth() < 9 ? "0" + (parseInt(d.getMonth() + 1)) : (parseInt(d.getMonth() + 1))) + "-" +
                        (d.getDate() < 10 ? "0" + d.getDate() : d.getDate())
                }
                $(td).html(dateStr);
                $(td).attr("data-value", dateStr);
            } else if (v.type == "datetime") {
                var timestamp = showValue;
                var dateStr = "";
                if (timestamp != null && timestamp != "" && timestamp != "-") {
                    var d = new Date(timestamp);    //根据时间戳生成的时间对象
                    dateStr = (d.getFullYear()) + "-" +
                        (d.getMonth() < 9 ? "0" + (parseInt(d.getMonth() + 1)) : (parseInt(d.getMonth() + 1))) + "-" +
                        (d.getDate() < 10 ? "0" + d.getDate() : d.getDate()) + " " +
                        (d.getHours() < 10 ? "0" + d.getHours() : d.getHours()) + ":" +
                        (d.getMinutes() < 10 ? "0" + d.getMinutes() : d.getMinutes());
                }
                $(td).html(dateStr);
                $(td).attr("data-value", dateStr);
            } else if (v.type == "rowNum") {
                if (dataIndex != null) {
                    var idx = parseInt(dataIndex);
                    $(td).html(idx + 1);
                    $(td).attr("data-value", idx + 1);
                } else {
                    $(td).html("[new]");
                    $(td).attr("-1");
                }
            } else {
                $(td).html("" + showValue);
            }

            if (v.visible == false) {
                $(td).addClass("display-none");
            }

            $(tr).append(td);
            if (v.onclick != null && v.onclick != "") {
                $(td).on("click", function () {
                    doFnWithDataId(v.onclick, td);
                });
            }
        }
        );
        //操作区td
        if (options != null) {
            var optTd = $("<td style='vertical-align: middle'></td>")
            $.each(options, function (i, opt) {
                var color = opt.color == null ? " " : opt.color + " ";
                var flag = opt.flag == null ? " " : opt.flag + " ";
                var title = opt.title == null ? "" : opt.title;
                var a_tag;
                var icon = opt.icon;
                var btnName = opt.name;
                var fontSize = "";
                if (icon != null) {
                    btnName = "";
                    color = "";
                    fontSize = "font-size:18px;";
                }
                a_tag = $("<a class='btn " + color + flag + "' title='" + title + "' href='javascript:void(0);' style='color: #333;" + fontSize + "'><i class='" + icon + "'></i>" + btnName + "</a>");
                if (opt.option != null) {
                    $(a_tag).attr("href", "#" + opt.option).attr("data-toggle", "modal");
                    if (opt.edit) {//如果设置了编辑，将启用行转model功能
                        $(a_tag).on("click", function () {
                            rowToModal(dataId, opt.option);
                        });

                        if (opt.editMain) {
                            $(tr).on("dblclick", function () {
                                $(a_tag).trigger("click");
                            })
                        }
                        if (opt.visible == false) {
                            $(a_tag).css("display", "none");
                        }
                    }
                }
                if (opt.pre != null && opt.pre != "") {//之前
                    $(a_tag).on("click", function () {
                        doFnWithDataId(opt.pre, this);
                    });
                }

                if (opt.customClass != null && opt.customClass.length > 0) {
                    for (var i = 0; i < opt.customClass.length; ++i) {
                        var clsArr = opt.customClass[i].split("=");
                        $(a_tag).attr(clsArr[0], clsArr[1]);
                    }
                }

                if (opt.del != null && opt.del != "") {//如果是删除功能
                    $(a_tag).on("click", function () {
                        bootbox.setLocale("zh_CN");
                        var tipMsg = opt.msg;
                        if (tipMsg == null) {
                            tipMsg = "确定要删除该条记录吗？";
                        }
                        bootbox.confirm(tipMsg, function (result) {
                            if (result) {
                                Shinez.del(opt.del + "/" + dataId, function (ret) {
                                    if (ret.code == 0) {
                                        Shinez.tip("success", "删除成功");
                                        delRow(dataId);
                                    } else {
                                        Shinez.tip("error", ret.msg);
                                    }
                                });
                            }
                        });
                    });
                }


                $(modal).find("#" + opt.option).find(".btn-save").unbind("click").on("click", function () {
                    if (opt.url != null && opt.url != "") {
                        var validresult;
                        if (opt.before == null || opt.before == "") {
                            validresult = true
                        } else {
                            validresult = doFn(opt.before);
                        }
                        var flag = true;
                        if (validresult && flag) {
                            Shinez.put(opt.url.replace("{id}", $(modal).find("#" + opt.option).find("[name=id]").val()), $(modal).find("#" + opt.option).find("form").serialize(), function (ret) {
                                if (ret.code == 0) {
                                    flag = false;
                                    $(".modal").modal('hide');
                                    Shinez.tip("success", (opt.success == null || opt.success == "") ? "操作成功" : opt.success);
                                    setTimeout(function () {
                                        $(params).find(".search").trigger("click")
                                    }, 300);
                                } else {
                                    Shinez.tip("error", ret.msg);
                                }
                            });
                        }

                    }
                    if (opt.submit != null && opt.submit != "") {
                        doFn(opt.submit);
                    }
                });

                $(optTd).append(a_tag);
            });
            $(tr).append(optTd);
        }
        $(table).find("tbody").append(tr);
    };


    //数据请求ajax
    var turnPage = function (obj) {
        if (multiple === true) {
            $(table).find("thead tr").find("th:first input").prop("checked", false);
            checkedIds = [];
        }
        var $this = $(obj);
        var input;
        if (obj != null) {
            input = document.createElement('input');
            input.type = 'hidden';
            input.name = "pageIndex";
            input.value = $.trim($this.attr("data-index"));
            $(params).append(input);
        }

        Shinez.get(url, $(params).serialize(), function (ret) {
            if (ret.code == 0) {
                page = ret.data.page;
                buildPageNums();
                $(table).find("tbody").html("");
                if (page.total == 0) {
                    noDataFlag();
                }

                $.each(page.list, function (key, value) {
                    buildRow(key, value["id"], function (v) {
                        return value[v.data];
                    });
                });
                if (endFn != null) {
                    doFnWithData(endFn, ret.data);
                }
                if (endFnOnceFlag && endFnOnce != null && endFnOnce != '') {
                    registerPageComponent();
                    doFnWithData(endFnOnce, ret.data);
                    endFnOnceFlag = false;
                }
                $("#modal-add").find("input[type=checkbox]").not(".no-init").bootstrapSwitch();
                $("#modal-edit").find("input[type=checkbox]").not(".no-init").bootstrapSwitch();
                table.find("td").find("input[type=checkbox]").not(".no-init").bootstrapSwitch();
                $(params).find(".search").attr("data-index", page.pageNum).attr("last-page", page.lastPage);

                if (authValid === true) {
                    clearAuth(ret.data)
                }
            } else if (ret.code == 10200) {
                sessionStorage.clear();
                location.href = "/";
            } else {
                Shinez.tip("error", "数据加载失败：" + ret.msg);
                $(".loading-tip").html("数据加载失败：" + ret.msg).css("color", "red");
            }
            $("input[name=pageIndex]").remove();
        });

    };

    var clearAuth = function (data) {
        var rolesArr = data.roles;

        $("*[data-roles]").each(function (k, v) {
            var val = $(v).attr("data-roles");
            var valArr = val.split(",")
            var hasRole = false;
            debugger
            for (var i = 0; i < rolesArr.length; ++i) {
                for (var j = 0; j < valArr.length; ++j) {
                    if (rolesArr[i] === valArr[j]) {

                        hasRole = true;
                        break;
                    }
                }
                if (hasRole === true) {
                    break;
                }
            }
            if (hasRole === false) {
                $(v).remove()
            }
        });
    }

    //构建翻页插件
    var buildPageNums = function () {
        $(table).find("tfoot tr[class=page-nums]").remove();
        if (page.total == 0) return;
        var ul;
        var footLi;
        var tr = $("<tr class='page-nums'></tr>");
        if (page.pages == 1) {
            ul = $("<ul class='pagination pull-left'></ul>");
            footLi = $("<li><span> 共<span id='data-total'>" + page.total + "</span>条记录</span></li>");
            $(ul).append(footLi);
            var td = $("<td style='border-left:none;' colspan='" + columNum + "'></td>");
            td.append(ul);
            tr.append(td);
            $(table).find("tfoot").append(tr);
            return;
        }

        var homeLi;
        var preLi;
        var currentLi;
        var nextLi;
        var lastLi;

        ul = $("<ul class='pagination pull-right'></ul>");
        var tdLeft = $("<td style='border-right: none' colspan='2'></td>");
        var ulLeft = $("<ul class='pagination pull-left'></ul>");
        $(ulLeft).append("<li><a style='padding: 3px;margin-right:10px;border: none'>Page <input id='pagenum-input'  min='1' max='" + page.pages + "' type='number' value='" + page.pageNum + "' style='width: 50px;text-align: center'> </a><a class='btn btn-sm blue' data-index='' href='javascript:;'>GO</a></li>");
        $(ulLeft).find("#pagenum-input").on("change", function () {
            if ($(this).val() < 1) {
                $(this).val(1);
            } else if ($(this).val() > page.pages) {
                $(this).val(page.pages);
            }
        });
        $(ulLeft).find(".btn").on("click", function () {
            $(this).attr("data-index", $(ulLeft).find("#pagenum-input").val());
            turnPage(this);
        });
        $(tdLeft).append(ulLeft);
        $(tr).append(tdLeft);

        //构建页码
        if (page.pageNum == 1) {
            homeLi = $("<li><a href='javascript:;'>首页</a></li>");
            preLi = $("<li><a href='javascript:;'>上一页</a></li>");
        } else {
            homeLi = $("<li><a data-index='1' href='javascript:;'>首页</a></li>");
            preLi = $("<li><a data-index='" + (parseInt(page.pageNum) - 1) + "' href='javascript:;'>上一页</a></li>");
            $(homeLi.find("a")).on("click", function () {
                turnPage(this);
            });
            $(preLi.find("a")).on("click", function () {
                turnPage(this);
            });
        }

        $(ul).append(homeLi).append(preLi);
        for (var i = page.firstPage; i <= page.lastPage; ++i) {
            if (page.pageNum == i) {
                currentLi = $("<li class='active'><a href='javaScript:;'>" + i + "<span class='sr-only'>(current)</span></a></li>");
            } else {
                currentLi = $("<li><a data-index='" + i + "' href='javascript:;'>" + i + "</a></li>");
                $(currentLi.find("a")).on("click", function () {
                    turnPage(this);
                });
            }
            $(ul).append(currentLi);
        }

        if (page.pageNum == page.lastPage) {
            nextLi = $("<li><a href='javascript:;'>下一页</a></li>");
        } else {
            nextLi = $("<li><a data-index='" + (parseInt(page.pageNum) + 1) + "' href='javascript:;' >下一页</a></li>");
            $(nextLi.find("a")).on("click", function () {
                turnPage(this);
            });
        }

        if (page.pageNum == page.pages) {
            lastLi = $("<li><a href='javascript:;'>尾页</a></li>");
        } else {
            lastLi = $("<li><a data-index='" + page.pages + "' href='javascript:;'>尾页</a></li>");
            $(lastLi.find("a")).on("click", function () {
                turnPage(this);
            });
        }
        footLi = $("<li><span> 共<span id='data-total'>" + page.total + "</span>条记录,共" + page.pages + "页</span></li>");
        $(ul).append(nextLi).append(lastLi).append(footLi);
        var td = $("<td style='border-left:none;' colspan='" + (parseInt(columNum) - 2) + "'></td>");
        td.append(ul);
        tr.append(td);
        $(table).find("tfoot").append(tr);
    };

    var registerPageComponent = function () {
        var $dataRef = $("*[data-ref]");
        $.each($dataRef, function (i, j) {
            if ($(j).attr("data-ref").indexOf("::") == -1) {
                $(j).parents("td").find("*[name=" + $(j).attr("data-ref") + "]").on("change", function () {
                    if ($(this).is("select")) {
                        $(j).val($(this).find("option[value=" + $(this).val() + "]").html());
                    } else {
                        $(j).blur();
                        $(j).focus();
                        $(j).val($(this).val());
                    }
                });
            } else {
                var names = $(j).attr("data-ref").split("::");
                var dataMethod = $(j).attr("data-method");
                if (dataMethod.indexOf("concat") != -1) {
                    var sp = dataMethod.substring(7, dataMethod.lastIndexOf(")"));
                    var newVal = "";
                    $.each(names, function (k, v) {
                        $(j).parents("td").find("*[name=" + v + "]").on("change", function () {
                            newVal = "";
                            $.each(names, function (y, z) {
                                newVal += $(j).parents("td").find("*[name=" + z + "]").val();
                                newVal += sp;
                            });
                            newVal = newVal.substring(0, newVal.lastIndexOf(sp));
                            $(j).val(newVal);
                        });
                    });
                }
            }
        });

    };
    //执行函数
    var doFnWithDataId = function (fnName, obj) {
        if (obj != null) {
            var data_id;
            if (obj instanceof Object)
                data_id = $(obj).parents("tr").attr("data-id");
            else
                data_id = obj;
            fnName = fnName + "(" + data_id + ")";
        } else {
            fnName = fnName + "()";
        }
        eval(fnName);
    };

    var doFnWithData = function (fnName, data) {
        var excuteStr = fnName + "(data)";
        eval(excuteStr);
    };


    //执行函数
    var doFn = function (fnName) {
        fnName = fnName + "()";
        return eval(fnName);
    };


    //列字段转换
    var convertVal = function (fnName, val) {
        if (isNaN("'" + val + "'") && val != true && val != false && val != "true" && val != "false") {
            val = "'" + val + "'";
        }
        fnName = fnName + "(" + val + ")";
        return eval(fnName);
    };

    var rowToModal = function (dataId, modalId) {
        var tr = $("tr[data-id=" + dataId + "]");
        $("#" + modalId).find("input[name=id]").val(dataId);
        var tds = $(tr).find("td");
        $.each(tds, function (k, v) {
            var $element = $("#" + modalId).find("*[name=" + $(v).attr("data-name") + "]");
            $.each($element, function (i, j) {
                if ($(j).is("img")) {
                    $(j).prop("src", $(v).attr("data-value"));
                } else if ($(j).is("[type=checkbox]")) {
                    if ($(j).val() == "true") $(j).val(1);
                    if ($(j).val() == "false") $(j).val(0);
                    if (
                        (($(v).attr("data-value") == "true" || $(v).attr("data-value") == 1) && $(j).val() == 1)
                        || (($(v).attr("data-value") == "false" || $(v).attr("data-value") == 0) && $(j).val() == 0)
                    ) {
                        $(j).bootstrapSwitch('state', true);
                    } else {
                        $(j).bootstrapSwitch('state', false);
                    }
                } else {
                    $(j).val($(v).attr("data-value"));
                    $(j).trigger("change");
                }

                if ($(j).attr("data-ref") != null) {
                    if ($(j).attr("data-ref").indexOf("::") == -1) {
                        if ($(j).val() == "true") $(j).val(1);
                        if ($(j).val() == "false") $(j).val(0);

                        if ($(j).val() == "") $(j).val(-1);
                        $(j).parents("td").find("*[name=" + $(j).attr("data-ref") + "][value=" + $(j).val() + "]").prop("checked", true).change();

                        // $(j).parents("td").find("*[name=" + $(j).attr("data-ref") + "]").on("change", function () {
                        //     if ($(this).is("select")) {
                        //         $(j).val($(this).find("option[value=" + $(this).val() + "]").html());
                        //     } else {
                        //         $(j).blur();
                        //         $(j).focus();
                        //         $(j).val($(this).val());
                        //     }
                        // });
                    } else {
                        // var names = $(j).attr("data-ref").split("::");
                        // var dataMethod = $(j).attr("data-method");
                        // if (dataMethod.indexOf("concat") != -1) {
                        //     var sp = dataMethod.substring(7, dataMethod.lastIndexOf(")"));
                        //     var newVal = "";
                        //     $.each(names, function (k, v) {
                        //         $(j).parents("td").find("*[name=" + v + "]").on("change", function () {
                        //             newVal = "";
                        //             $.each(names, function (y, z) {
                        //                 newVal += $(j).parents("td").find("*[name=" + z + "]").val();
                        //                 newVal += sp;
                        //             });
                        //             newVal = newVal.substring(0, newVal.lastIndexOf(sp));
                        //             $(j).val(newVal);
                        //         });
                        //     });
                        // }
                    }
                    $(j).change();
                }
            });
        });
    };

    var noDataFlag = function () {
        var tr = $(table).find("tr[class=no-data]");
        if ($(table).find("tbody tr").length == 0) {
            tr = $("<tr class='no-data'></tr>");
            var td = $("<td class='text-center' colspan='" + columNum + "'>没有符合条件的记录</td>");
            $(tr).append(td);
            $(table).find("tbody").append(tr);
        } else {
            $(tr).remove();
        }
    }


    var delRow = function (id) {
        $(table).find("tr[data-id=" + id + "]").fadeOut(1000);
        $(table).find("#data-total").html(parseInt($(table).find("#data-total").html()) - 1);
        noDataFlag();
    };

    var checkChildren = function (event) {
        var eState = $(event.target).prop("checked");
        var tr = $(table).find("tbody tr");
        checkedIds = [];
        tr.each(function (k, v) {
            $(v).find("td:first input").prop("checked", eState);
            if (eState === true) {
                checkedIds.push($(v).find("td:first input").val())
            }
        });
    };

    var checkParent = function (event) {
        var eState = $(event.target).prop("checked");
        var id = $(event.target).val();
        if (eState === false) {
            $(table).find("thead tr").find("th:first input").prop("checked", false)
            checkedIds.forEach(function (v, k) {
                if (v == id) {
                    checkedIds.splice(k, 1);
                }
            })
        } else {
            checkedIds.push(id)
            var tdCheck = $(table).find("tbody tr input[class=no-init]");
            var checkAll = true;
            tdCheck.each(function (k, v) {
                if ($(v).prop("checked") === false) {
                    checkAll = false;
                    return false;
                }
            });
            $(table).find("thead tr").find("th:first input").prop("checked", checkAll)
        }

    }


    return {
        init: function (data) {
            url = data.url;
            multiple = data.multiple;
            tableMethod = data.tableMethod == null ? "GET" : data.tableMethod;
            table = $("#" + data.tableName);
            columNum = $(table).find("thead").find("th").length;
            columns = data.columns;
            modal = $("#" + data.modal);
            params = $("#" + data.paramsFormName);
            authValid = data.authValid;
            $(params).find(".search").on("click", function () {
                turnPage(this);
            });
            options = data.options;
            if (options != null) {
                $(table).find("thead tr").find("th[name=opt-th]").remove();
                $(table).find("thead tr").append("<th name='opt-th'>操作</th>");
            }
            if (multiple === true) {
                $("<th><label class='mt-checkbox'><input onclick='DataTable.checkChildren(event)' class='no-init'   type='checkbox'  value='1'><span><span></span></span></label></th>").insertBefore($(table).find("thead tr").find("th:first"));
            }
            columNum++;

            handles = data.handles;
            endFnOnceFlag = true;
            endFn = data.endFn;
            endFnOnce = data.endFnOnce;
            if (handles != null) {
                $.each(handles.insert, function (k, v) {
                    $(modal).find("#" + v.modalId).on('show.bs.modal', function (e) {
                        $(e.relatedTarget).on("click", function () {
                            $(modal).find("#" + v.modalId).find("input[type=text]").not(".inputtime").val("");
                        })
                    });
                    $(modal).find("#" + v.modalId).find(".btn-save").on("click", function () {
                        //添加
                        var validresult;
                        if (v.fn == null || v.fn == "") {
                            validresult = true;
                        } else {
                            validresult = doFn(v.fn);
                        }
                        var flag = true;
                        if (validresult && flag) {
                            flag = false;
                            var newTds = $(modal).find("#" + v.modalId).find("td");
                            var dataRef = "";
                            $.each(newTds, function (k, v) {
                                dataRef = $(v).find("*[data-ref]").attr("data-ref");
                                if (dataRef != null) {
                                    if (dataRef.indexOf("::") == -1) {
                                        if ($(v).find("*[name=" + dataRef + "]").is("select")) {
                                            $(v).find("*[data-ref]").val($(v).find("*[name=" + dataRef + "]").find("option[value=" + $(v).find("*[name=" + dataRef + "]").val() + "]").html());
                                        } else {
                                            $(v).find("*[data-ref]").val($(v).find("*[name=" + dataRef + "]:checked").val());
                                        }
                                    } else {
                                        var names = $(v).find("*[data-ref]").attr("data-ref").split("::");
                                        var dataMethod = $(v).find("*[data-ref]").attr("data-method");
                                        if (dataMethod.indexOf("concat") != -1) {
                                            var sp = dataMethod.substring(7, dataMethod.lastIndexOf(")"));
                                            var newVal = "";
                                            $.each(names, function (k1, v1) {
                                                newVal = "";
                                                $.each(names, function (y, z) {
                                                    newVal += $(v).find("*[name=" + z + "]").val();
                                                    newVal += sp;
                                                });
                                                newVal = newVal.substring(0, newVal.lastIndexOf(sp));
                                                $(v).find("*[data-ref]").val(newVal);
                                            });
                                        }
                                    }

                                }
                            });
                            Shinez.post(v.url, $(modal).find("#" + v.modalId).find("form").serialize(), function (ret) {
                                if (ret.code == 0) {
                                    flag = true;
                                    // addRow(ret.data.obj, v.modalId);
                                    $(".modal").modal('hide');
                                    Shinez.tip("success", "添加成功");

                                    setTimeout(function () {
                                        $(".search").trigger("click");
                                    }, 300);
                                } else {
                                    Shinez.tip("error", ret.msg);
                                }
                            });
                        }
                    });
                });

            }
            if (multiple === true) {
                columNum++;
            }
            $(table).find("tbody").html("").append("<tr><td colspan='" + columNum + "' class='text-center loading-tip'>请稍后，数据加载中...</td></tr>");
            turnPage();
        },
        rowToModal: function (dataId, modalId) {
            rowToModal(dataId, modalId);
        },
        convert: function (role, value) {
            return convertDataValue(role, value);
        },
        checkChildren: function (event) {
            return checkChildren(event)
        },

        checkParent: function (event) {
            return checkParent(event)
        },
        getCheckedId: function () {
            return checkedIds;
        }
    }
}
    ();
