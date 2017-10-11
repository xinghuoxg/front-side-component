var gulp = require('gulp');
var ejs  = require('gulp-ejs');

gulp.task('ejs', function() {
    gulp.src('src/**.ejs')
        .pipe(ejs())
    .pipe(gulp.dest('dist'));
});