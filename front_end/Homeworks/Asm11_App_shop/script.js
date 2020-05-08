var Shop = {
    dataDrink: [
        {
            idDrink: 1,
            nameDrink: 'Coffee',
            gia: 20000
            },
        {
            idDrink: 2,
            nameDrink: 'CocaCola',
            gia: 10000
            },
        {
            idDrink: 3,
            nameDrink: 'Nước Chanh',
            gia: 15000
            }],
    dataCurrent: []
}
var dash = document.getElementById('dashboard');
var rowTable = document.getElementById('rowTable');
var totalMoney = document.getElementById('totalMoney');
var search = document.getElementById('search');
var card = document.getElementById('card');
var menu = document.getElementById('menu');
var closeds = document.getElementById('closed');
var nameDU = document.getElementById('nameDU');
var sl = document.getElementById('sl');
var submits = document.getElementById('submit');

var nut = '';
for (var i = 0; i < Shop.dataDrink.length; i++) {
    nut += "<button onclick='showCard(" + Shop.dataDrink[i].idDrink + ")'>";
    nut += "<h1>" + Shop.dataDrink[i].nameDrink + "</h1>";
    nut += "<span>" + Shop.dataDrink[i].gia + "</span>";
    nut += "</button>";
}
dash.innerHTML = nut;

function showCard(id) {
    menu.style.display = 'block';
    for (var i = 0; i < Shop.dataDrink.length; i++) {
        if (Shop.dataDrink[i].idDrink == id) {
            nameDU.innerHTML = "<b id='nameDU'>" + Shop.dataDrink[i].nameDrink + "</b>"
        }
    }
    menu.children[6].innerHTML = "<button id='submit' onclick='submit(" + id + ")'>Xác nhận</button>";
}

function addCurrent(id) {
    for (var i = 0; i < Shop.dataDrink.length; i++) {
        if (Shop.dataDrink[i].idDrink == id) {
            var item = {
                idCurrent: id,
                nameCurrent: Shop.dataDrink[i].nameDrink,
                gia: Shop.dataDrink[i].gia,
                sl: Number(sl.value)
            }
            Shop.dataCurrent.push(item);
        }
    }
}

function updateCurrent(id) {
    var kt = 0;
    for (var i = 0; i < Shop.dataCurrent.length; i++) {
        if (Shop.dataCurrent[i].idCurrent == id) {
            Shop.dataCurrent[i].sl += Number(sl.value);
            kt++;
        }
    }
    if (kt == 0) {
        addCurrent(id);
    }
}

function submit(id) {
    menu.style.display = 'none';
    if (Shop.dataCurrent.length > 0) {
        updateCurrent(id);
    } else {
        addCurrent(id);
    }
    addDU();
    sl.value = 0;
}

function addDU() {
    var ttMoney = 0;
    var text = "<tr><th style='width: 45%;'>Tên đồ uống</th><th style='width: 25%';>Số lượng</th><th>Giá</th></tr>";
    for (var i = 0; i < Shop.dataCurrent.length; i++) {
        text += "<tr>";
        text += "<td>" + Shop.dataCurrent[i].nameCurrent + "</td>";
        text += "<td>" + Shop.dataCurrent[i].sl + "</td>";
        text += "<td>" + Shop.dataCurrent[i].gia + "</td>";
        text += "</tr>";
    }
    for (var i = 0; i < Shop.dataCurrent.length; i++) {
        ttMoney += Shop.dataCurrent[i].gia * Shop.dataCurrent[i].sl;
    }
    text += "<th colspan='3' style='padding-left: 70%;text-align: left;'>Tổng: " + ttMoney + "</th>";
    rowTable.innerHTML = text;
}

function mySearch() {
    if (search.value == '') {
        hideCardSearch();
    } else {
        showCardSearch();
    }
}

function showCardSearch() {
    var text = '';
    for (var i = 0; i < Shop.dataDrink.length; i++) {
        if (Shop.dataDrink[i].nameDrink.indexOf(search.value) != -1) {
            text += "<p>" + Shop.dataDrink[i].nameDrink + "</p>";
            card.style.display = "block";
        } else {
            hideCardSearch();
        }
    }
    card.innerHTML = text;
}

function hideCardSearch() {
    card.style.display = "none";
}

closeds.addEventListener('click', function () {
    menu.style.display = 'none';
    sl.value = 0;
});
