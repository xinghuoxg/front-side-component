define(['jquery'],function ($){
    var add = function (x,y){
        return x+y;
    };
    var menuClick = function () {
        $("ul.nav-menu li a").click(this,function () {
            this.parent().nextAll().removeChild(".nav-menu li.active");
            this.parent().addClass(".nav-menu li.active");
        })
    }
    return {
        add: add,
        menuClick:menuClick
    };
});