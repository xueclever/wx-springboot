(function () {
    login();
})();

function login() {
    var token = localStorage.getItem(TOKEN_FIELD);
    if(token===null){
        var current = location.href;
        localStorage.setItem("current_url",current);
        location.href = OAUTH2_REDIRECT;
    }
}