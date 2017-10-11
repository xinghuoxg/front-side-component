define(['jquery'],function ($){
    var menuClick = function () {
        $("ul.nav-menu li a").click(function () {
            $("ul.nav-menu li").not($(this).parent()).removeClass("active");
            $(this).parent().addClass('active');
        })
    }
    return {
        menuClick:menuClick
    };
});