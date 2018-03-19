/**
 * Created by Administrator on 2016/10/20.
 */

const custom = {
    domain:"http://admin.danduoduo.com.cn/api/",
    authAlias: "Nougat",
    authHeader: "Authorization",
}

//数据字典
var dataDict = {}


function getsec(str) {
    if (str == null)
        return;
    let str1 = str.substring(1, str.length) * 1;
    let str2 = str.substring(0, 1);
    if (str2 == "s") {
        return str1 * 1000;
    } else if (str2 == "h") {
        return str1 * 60 * 60 * 1000;
    } else if (str2 == "d") {
        return str1 * 24 * 60 * 60 * 1000;
    }
}

if (jQuery) {

    $.fn.serializeObject = function () {
        var o = {};
        var a = this.serializeArray();
        $.each(a, function () {
            if (o[this.name]) {
                if (!o[this.name].push) {
                    o[this.name] = [o[this.name]];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };
    Shinez = {
        test: () => {
            console.log("hello shinez")
        },

        tip: function (type, info) {
            toastr[type](info, type);
            toastr.options = {
                "closeButton": true,
                "debug": true,
                "positionClass": "toast-top-center",
                "onclick": null,
                "showDuration": "1000",
                "hideDuration": "1000",
                "timeOut": "5000",
                "extendedTimeOut": "1000",
                "showEasing": "swing",
                "hideEasing": "linear",
                "showMethod": "fadeIn",
                "hideMethod": "fadeOut"
            }
        },
        deepClone: function (initalObj, finalObj) {
            let obj = finalObj || {};
            for (let i in initalObj) {
                let prop = initalObj[i];
                // 避免相互引用对象导致死循环，如initalObj.a = initalObj的情况
                if (prop === obj) {
                    continue;
                }
                if (typeof prop === 'object') {
                    obj[i] = (prop.constructor === Array)
                        ? []
                        : Object.create(prop);
                } else {
                    obj[i] = prop;
                }
            }
            return obj;
        },
        loading: () => {
            try {
                App.blockUI({boxed: true, zIndex: 999999});
            } catch (e) {
            }
        },
        loadingComplete: () => {
            try {
                App.unblockUI();
            } catch (e) {
            }
        },

        //增
        post: (url, data, successCallback) => {
            if (typeof(data) == "function") {
                successCallback = data;
                data = {};
            }
            return Shinez.xhr("POST", url, data, true, successCallback, "json");
        },
        //查
        get: (url, data, successCallback) => {
            if (typeof(data) == "function") {
                successCallback = data;
                data = {};
            }
            return Shinez.xhr("GET", url, data, true, successCallback, "json");
        },
        //删
        del: (url, data, successCallback) => {
            if (typeof(data) == "function") {
                successCallback = data;
                data = {};
            }
            return Shinez.xhr("DELETE", url, data, true, successCallback, "json");
        },
        //update
        put: (url, data, successCallback) => {
            if (typeof(data) == "function") {
                successCallback = data;
                data = {};
            }
            return Shinez.xhr("PUT", url, data, true, successCallback, "json");
        },
        xhrf: function (url, data, async, successCallback) {
            var formData = new FormData(data);
            return $.ajax({
                url: custom.domain + url,
                type: "POST",
                data: formData,
                dataType: "json",
                async: async,
                processData: false,
                contentType: false,
                cache: false,
                success: successCallback,
                headers: {
                    "Authorization": Shinez.getCookie(custom.authAlias)
                },
                beforeSend: function (XMLHttpRequest) {
                    Shinez.loading();
                    $("button").prop("disabled", true);
                    $("input").prop("disabled", true);
                    $("*[type=submit]").prop("disabled", true);
                },
                complete: function (ret) {
                    Shinez.loadingComplete();
                    $("*[type=submit]").prop("disabled", false);
                    $("input").prop("disabled", false);
                    $("button").prop("disabled", false);
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    console.log(XMLHttpRequest.responseText);
                }
            });
        },
        xhr: function (type, url, data, async, successCallback, dataType, contentType) {
            if (contentType == null) {
                contentType = "application/x-www-form-urlencoded;charset=utf-8";
            }
            return $.ajax({
                url: custom.domain + url,
                type: type,
                async: async,
                contentType: contentType,
                data: data,
                dataType: dataType,
                success: successCallback,
                headers: {
                    "Authorization": Shinez.getCookie(custom.authAlias)
                },
                beforeSend: function (XMLHttpRequest) {
                    Shinez.loading();
                    $("button").prop("disabled", true);
                    $("*[type=submit]").prop("disabled", true);
                },
                complete: function (ret) {
                    Shinez.loadingComplete();
                    $("*[type=submit]").prop("disabled", false);
                    $("button").prop("disabled", false);
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    console.log(XMLHttpRequest.responseText);
                }
            });
        },

        FormateDate: function (now, mask) {
            const d = now;
            const zeroize = function (value, length) {
                if (!length)
                    length = 2;
                value = String(value)
                let i,
                    zeros;
                for (i = 0, zeros = ''; i < (length - value.length); i++) {
                    zeros += '0';
                }
                return zeros + value;
            };

            return mask.replace(/"[^"]*"|'[^']*'|\b(?:d{1,4}|m{1,4}|yy(?:yy)?|([hHMstT])\1?|[lLZ])\b/g, function ($0) {
                switch ($0) {
                    case 'd':
                        return d.getDate();
                    case 'dd':
                        return zeroize(d.getDate());
                    case 'ddd':
                        return [
                            'Sun',
                            'Mon',
                            'Tue',
                            'Wed',
                            'Thr',
                            'Fri',
                            'Sat'
                        ][d.getDay()];
                    case 'dddd':
                        return [
                            'Sunday',
                            'Monday',
                            'Tuesday',
                            'Wednesday',
                            'Thursday',
                            'Friday',
                            'Saturday'
                        ][d.getDay()];
                    case 'M':
                        return d.getMonth() + 1;
                    case 'MM':
                        return zeroize(d.getMonth() + 1);
                    case 'MMM':
                        return [
                            'Jan',
                            'Feb',
                            'Mar',
                            'Apr',
                            'May',
                            'Jun',
                            'Jul',
                            'Aug',
                            'Sep',
                            'Oct',
                            'Nov',
                            'Dec'
                        ][d.getMonth()];
                    case 'MMMM':
                        return [
                            'January',
                            'February',
                            'March',
                            'April',
                            'May',
                            'June',
                            'July',
                            'August',
                            'September',
                            'October',
                            'November',
                            'December'
                        ][d.getMonth()];
                    case 'yy':
                        return String(d.getFullYear()).substr(2);
                    case 'yyyy':
                        return d.getFullYear();
                    case 'h':
                        return d.getHours() % 12 || 12;
                    case 'hh':
                        return zeroize(d.getHours() % 12 || 12);
                    case 'H':
                        return d.getHours();
                    case 'HH':
                        return zeroize(d.getHours());
                    case 'm':
                        return d.getMinutes();
                    case 'mm':
                        return zeroize(d.getMinutes());
                    case 's':
                        return d.getSeconds();
                    case 'ss':
                        return zeroize(d.getSeconds());
                    case 'l':
                        return zeroize(d.getMilliseconds(), 3);
                    case 'L':
                        var m = d.getMilliseconds();
                        if (m > 99)
                            m = Math.round(m / 10);
                        return zeroize(m);
                    case 'tt':
                        return d.getHours() < 12
                            ? 'am'
                            : 'pm';
                    case 'TT':
                        return d.getHours() < 12
                            ? 'AM'
                            : 'PM';
                    case 'Z':
                        return d
                            .toUTCString()
                            .match(/[A-Z]+$/);
                    // Return quoted strings with the surrounding quotes removed
                    default:
                        return $0.substr(1, $0.length - 2);
                }
            });
        },

        dateDiff: function (hisTime, nowTime) {
            if (!arguments.length)
                return '';
            let arg = arguments,
                now = arg[1]
                    ? arg[1]
                    : new Date().getTime(),
                diffValue = now - arg[0],
                result = '',
                minute = 1000 * 60,
                hour = minute * 60,
                day = hour * 24,
                halfamonth = day * 15,
                month = day * 30,
                year = month * 12,
                _year = diffValue / year,
                _month = diffValue / month,
                _week = diffValue / (7 * day),
                _day = diffValue / day,
                _hour = diffValue / hour,
                _min = diffValue / minute;

            // if (_year >= 1) result = parseInt(_year) + "年前"; else if (_month >= 1) result
            // = parseInt(_month) + "个月前"; else if (_week >= 1) result = parseInt(_week) +
            // "周前";
            if (_year >= 1 || _month >= 1 || _week >= 1)
                result = FormatDate(new Date(hisTime), 'yyyy-MM-dd HH:mm:ss');
            else if (_day >= 1)
                result = parseInt(_day) + "天前";
            else if (_hour >= 1)
                result = parseInt(_hour) + "个小时前";
            else if (_min >= 1)
                result = parseInt(_min) + "分钟前";
            else
                result = "刚刚";
            return result;
        },
        showAlert: (msg, callback, callbackTimeout) => {
            $("#m-tip")
                .fadeIn(200)
                .html(msg);
            setTimeout(() => {
                    $("#m-tip").fadeOut(1000);
                    if (callback != null)
                        callback();
                }
                , callbackTimeout == null
                    ? 1500
                    : callbackTimeout);

        },

        setCookie: (name, value, time) => {
            let strsec = getsec(time);
            let exp = new Date();
            exp.setTime(exp.getTime() + strsec * 1);
            document.cookie = name + "=" + escape(value) + (time == null
                    ? ""
                    : ";expires=" + exp.toGMTString());
        },
        getCookie: (name) => {
            let arr,
                reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
            if (arr = document.cookie.match(reg))
                return unescape(arr[2]);
            else
                return null;
        }
        ,
        getQueryString: (name) => {
            let arr,
                reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
            let qs = location
                .search
                .substring(1, location.search.length);
            if (arr = qs.match(reg))
                return unescape(arr[2]);
            else
                return null;
        }
        ,
        //删除cookies
        delCookie: (name) => {
            let exp = new Date();
            exp.setTime(exp.getTime() - 1);
            let cval = Shinez.getCookie(name);
            if (cval != null)
                document.cookie = name + "=" + cval + ";expires=" + exp.toGMTString();
        }
    };
} else {
    console.error("unable to find jquery!");
}

function registerImageUploadComponent() {
    //上传图片点击事件
    $(".btn-upload")
        .unbind("click")
        .on("click", function () {
            var obj = $(this).prev();
            obj.change(function () {
            }).trigger("click");
        });

    function upload(r, obj) {
        Shinez.tip("warning", "正在上传...");
        var token = "";
        var domain = "";
        Shinez.get("/main/qiniu-token", function (ret) {
            token = ret.data.uploadToken;
            domain = ret.data.domain;
        });
        setTimeout(function () {
            var data = new FormData();
            data.append('file', r);
            data.append("token", token);
            $.ajax({
                url: "http://up-z2.qiniu.com",
                data: data,
                type: "POST",
                processData: false,
                contentType: false,
                success: function (ret) {
                    console.log(ret);
                    var path = domain + ret.key;
                    // document.execCommand("insertimage", 0, path);
                    $(obj).find("img").attr("src",path);
                    var isExchange = $(obj).siblings("input")[0].value != "";
                    $($(obj).siblings("input")[0]).val(path);
                    Shinez.tip("success", "上传成功");

                    if ($(obj).parents(".upload-multiple").length > 0 && !isExchange) {
                        var $newObject = $($(obj).parents(".pull-left")[0]).clone(true);
                        $newObject.find("img").attr("src", "");
                        $newObject.find("input[type=hidden]").val("");
                        var i = $newObject.find(".img-del").attr("data-index");
                        $newObject.find(".img-del").attr("data-index",parseInt(i)+1);
                        $(obj).parents(".upload-multiple").append($newObject[0]);
                    }

                },
                beforeSend: function (XMLHttpRequest) {
                    Shinez.loading();
                    $("input").prop("disabled", "disabled");
                    $("button").prop("disabled", "disabled");
                    $("*[type=submit]").attr("disabled", "disabled");

                },
                complete: function (ret) {
                    Shinez.loadingComplete();
                    $("*[type=submit]").removeAttr("disabled");
                    $("input").removeAttr("disabled");
                    $("button").removeAttr("disabled");
                },
                error: function (ret) {
                    Shinez.tip("error", "上传失败，请稍后重试");
                }
            });
        }, 1000);

    }

    //监控图片改变
    $('.pull-left input[type="file"]')
        .unbind("change")
        .change(function () {
            var $this = $(this);
            if (!Preview($this)) {
                return false;
            }
            upload($this.get(0).files[0], this);
        });

    $(".img-del"). unbind("click").on("click", function () {
        var pls = $(this).parents(".upload-multiple").find(".pull-left");
        if(pls.length==1){
            $(this).parents(".pull-left").find("img").attr("src","");
            $(this).parents(".pull-left").find("input[type=hidden]").val("");
        }else{
            $(this).parents(".pull-left").remove();
        }
    });

}

//校验格式 前端处理图片
/**
 * @return {boolean}
 */
function Preview(e) {
    var ext = $(e)
        .val()
        .split(".")[1]
        .toUpperCase();
    if ($(e)[0].files[0].size > 153600) {
        Shinez.tip("error", "图片大小不能超过150k");
        return false;
    }
    if (ext != "PNG" && ext != "GIF" && ext != "JPG" && ext != "JPEG") {
        Shinez.tip("error", "图片限于png，gif，jpeg，jpg格式！");
        return false;
    } else {
        var url = window.URL.createObjectURL($(e)[0].files[0]);
        $(e)
            .next()
            .find("img")
            .attr("src", url);
        $(e)
            .next()
            .find(".img-tip")
            .css("color", "#fff")
            .html("更改图片");
        return true;
    }
}

function output(obj, href) {
    $(obj).attr("disabled", "disabled");
    location.href = domain + href;
    setTimeout(function () {
        $(obj).removeAttr("disabled");
    }, 5000);
}