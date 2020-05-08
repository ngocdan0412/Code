var elm = $('.elm');
var dot = $('.dot');
var prev = $('#prev');
var next = $('#next');
var all = $('#all');
var jinx = $('#jinx');
var war = $('#war');
var pyke = $('#pyke');
var aka = $('#aka');
var cJinx = $('.jinx');
var cWar = $('.war');
var cPyke = $('.pyke');
var cAkali = $('.akali');
var index = 0;
show(index);
var run = setInterval(nextImg, 5000);

function show(i) {
    //    elm[i].style.display = "block";
    //    dot[i].style.color = "#fff";
    elm.eq(i).css({
        'display': 'block'
    });
    dot.eq(i).css({
        'color': '#fff'
    });
}

function hide(i) {
    elm[i].style.display = "none";
    dot[i].style.color = "#333";
}

function showDot(d) {
    hide(index);
    show(index = d);
    finishInterval();
    beginInterval();
}

function prevImg() {
    hide(index);
    if (index == 0) {
        index = elm.length;
    }
    index--;
    show(index);
    finishInterval();
    beginInterval();
}

function nextImg() {
    hide(index);
    if (index == elm.length - 1) {
        index = 0;
    } else {
        index++;
    }
    show(index);
    finishInterval();
    beginInterval();
}

function finishInterval() {
    clearInterval(run);
}

function beginInterval() {
    run = setInterval(nextImg, 5000);
}
prev.click(prevImg);
next.click(nextImg);

function clearImg() {
    $('.lol').css({
        'display': 'none'
    });
}
all.click(function () {
    clearImg();
    $('.lol').css({
        'display': 'inline-block'
    });
});
jinx.click(function () {
    clearImg();
    cJinx.css({
        'display': 'inline-block'
    });
})
war.click(function () {
    clearImg();
    cWar.css({
        'display': 'inline-block'
    });
})
pyke.click(function () {
    clearImg();
    cPyke.css({
        'display': 'inline-block'
    });
})
aka.click(function () {
    clearImg();
    cAkali.css({
        'display': 'inline-block'
    });
})
