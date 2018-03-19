function ReqConfig(enabled, tip,isJson) {
    this.enabledLoading = enabled == null ? false : enabled;
    this.loadingTip = tip == null ? "loading" : tip;
    this.isJson =  isJson == null ? false : isJson;
    this.setLoading = function (boolVal) {
        this.enabledLoading = boolVal;
    }
    this.setLoadingTip = function (val) {
        this.loadingTip = val;
    }
    this.setJsonReq = function (val) {
        this.isJson = val;
    }
}

const SUCCESS=0;
const FAIL=-1;
const req = {
    config: new ReqConfig(),
    setConfig: function (config) {
        this.config = config;
    },
    get: function (url, successCallback, failCallback) {
        return this.xhr("GET", url, null, successCallback, failCallback);
    }
    ,
    post: function (url, param, successCallback, failCallback) {
        return this.xhr("POST", url, param, successCallback, failCallback);
    }
    ,
    put: function (url, param, successCallback, failCallback) {
        return this.xhr("PUT", url, param, successCallback, failCallback);
    }
    ,
    delete: function (url, param, successCallback, failCallback) {
        return this.xhr("DELETE", url, param, successCallback, failCallback);
    },
    xhr: function (method, url, param, successCallback, failCallback) {
        var config = this.config;
        var loading;
        var contentType=  "application/x-www-form-urlencoded";
        if(config.isJson){
            contentType = "application/json";
        }

        return $.ajax({
            url: API_URL + url,
            type: method,
            data: param,
            dataType: "json",
            contentType:contentType,
            success: successCallback,
            headers: {
                "Authorization": localStorage.getItem(TOKEN_FIELD)
            },
            beforeSend: function (req) {
                disabledSubmit();
                if (config.enabledLoading === true) {
                    loading = weui.loading(config.loadingTip, {
                        className: 'weui-loading-form'
                    });
                }
            },
            complete: function (ret) {
                enabledSubmit();
                if (config.enabledLoading === true) {
                    loading.hide(function () {
                    });
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                if (XMLHttpRequest.status == 401) {
                    login();
                }
                console.log(XMLHttpRequest.responseText);
                enabledSubmit();
                if (config.enabledLoading === true) {
                    loading.hide(function () {
                    });
                }
                failCallback();
            }
        });
    }
}

function disabledSubmit() {
    $("*[type=submit]").prop("disabled", true);
    $("input").prop("disabled", true);
    $("button").prop("disabled", true);
}

function enabledSubmit() {
    $("*[type=submit]").prop("disabled", false);
    $("input").prop("disabled", false);
    $("button").prop("disabled", false);
}


function getQueryString(name) {
    // 获取参数
    var url = window.location.search;
    // 正则筛选地址栏
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    // 匹配目标参数
    var result = url.substr(1).match(reg);
    //返回参数值
    return result ? decodeURIComponent(result[2]) : null;
}
