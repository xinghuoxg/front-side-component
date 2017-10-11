require.config({
    baseUrl: "../../lib",
    paths: {
        "jquery": "jquery.js/2.0.0/jquery.min",
        "nav":"nav"
    }
});
require(['jquery','nav'], function ($,nav){
    // some code here
    $(document).ready(function(){
        nav.menuClick();
    });

});