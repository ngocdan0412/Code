/*BT1:*/
function dienTichHinhChuNhat(cd, cr) {
    document.write('Diện tích hình chữ nhật có chiều dài ', cd, ' và chiều rộng ', cr, ' bằng: ', cd * cr);
}
//        dienTichHinhChuNhat(4, 3);

/*BT2:*/
function chanLe(n) {
    if (typeof (n) == 'number') {
        if (n % 2 == 0) {
            document.write('n = ', n, ' và n là số chẵn!');
        } else {
            document.write('n = ', n, ' và n là số lẻ!');
        }
    } else {
        document.write('Lỗi nhé......!!');
    }
}
//        chanLe(6);

/*BT3:*/
function kiemTraDiem(diem) {
    if (diem >= 0 && diem <= 10) {
        if (diem < 5) {
            document.write('Học sinh yếu');
        } else if (diem < 6.5) {
            document.write('Học sinh trung bình');
        } else if (diem < 8) {
            document.write('Học sinh khá');
        } else if (diem < 9) {
            document.write('Học sinh giỏi');
        } else {
            document.write('Học sinh xuất sắc');
        }
    } else {
        alert('Lỗi nhập điểm..!');
    }
}
//        kiemTraDiem(prompt('Nhập diểm: ', ''));

/*BT4:*/

function kiemTraMinMax(so1, so2, so3, so4) {
    if (typeof (so1 + so2 + so3 + so4) == 'number') {
        var min = so1;
        var max = so1;
        if (so2 > max) {
            max = so2;
        }
        if (so2 < min) {
            min = so2;
        }
        if (so3 > max) {
            max = so3;
        }
        if (so3 < min) {
            min = so3;
        }
        if (so4 > max) {
            max = so4;
        }
        if (so4 < min) {
            min = so4;
        }
        document.write('Max = ', max, '<br/>');
        document.write('Min = ', min);
    } else {
        document.write('Dữ liệu lỗi!!');
    }
}
// kiemTraMinMax(-5, 4, 2, 6);

/*BT5:*/
function phuongTrinhBac1(a, b) {
    if (a == 0) {
        if (b == 0) {
            document.write('Phương trình quá nhiều nghiệm!');
        } else {
            document.write('Phương trình vô nghiệm!');
        }
    } else {
        document.write('Phương trình 1 nghiệm x = ', -b / a);
    }
}

function phuongTrinhBac2(a, b, c) {
    if (a == 0) {
        phuongTrinhBac1(b, c);
    } else {
        var delta = b * b - 4 * a * c;
        if (delta < 0) {
            document.write('Phương trình vô nghiệm!');
        } else if (delta == 0) {
            var x = -b / (2 * a);
            document.write('Phương trình 1 nghiệm kép x1 = x2 = ', x);
        } else {
            var x1 = (-b + Math.sqrt(delta)) / (2 * a);
            var x2 = (-b - Math.sqrt(delta)) / (2 * a);
            document.write('Phương trình có 2 nghiệm: <br/> x1 =', x1, '<br/> x2 =', x2);
        }
    }
}
// phuongTrinhBac2(-1, 2, -1);

/*Tổng các số lẻ:*/
// function tongSoLe(n){
//     var Tong = 0;
//     for (var i = 0; i <= n; i++) {
//         if (i % 2 != 0) {
//             Tong += i;
//         }
//     }
//     return Tong;
// }
// var so = prompt('Nhập 1 số n:', '');
// while(isNAN(so)){
//     so = prompt('n không phải số, nhập lại:', '');
// }
// so = Number(so);
// document.write('Tổng các số lẻ từ 0 đến ',so,' là: ',tongSoLe(so));
function kiemTraSNT() {
    var kt = 0;
    var n = prompt('Nhập n: ', '');
    while(isNaN(n) || n == ''){
        n = prompt('Không hợp lệ!! Nhập lại n: ', '');
    }
    n = Number(n);
    for (var i = 1; i < n; i++) {
        if (n % i == 0) {
            kt++;
        }
    }
    if (kt == 1) {
        document.write('n là SNT');
    } else {
        document.write('n không phải là SNT');
    }
}
kiemTraSNT();
