// 「＝」と「Clear」以外のボタンが押されたとき、入力されたボタンの値を受け取り、
// これまでに入力されていた値と連結させる関数を作りましょう
let calc = document.getElementById('calc');
// 「Clear」ボタンが押されたとき、テキストボックス(id:calc)内に書かれている内容を消えるようにしましょう(空欄にする)
//「＝」ボタンが押されたときの処理
function Calc(){
    //テキストボックスを取得
    //参考url
    //https://wordpress.ideacompo.com/?p=14876
    //文字列　例：'5+4+6'を数式とみなして、処理させる
    var result = new Function('return ' + calc.value);
    console.log(result());
    //計算結果をテキストボックスに反映させる
    calc.value = result();
}


document.getElementById('btn0').addEventListener('click',function(){
    calc.value += btn0.value;
},false);
document.getElementById('btn1').addEventListener('click',function(){
    calc.value += btn1.value;
},false);
document.getElementById('btn2').addEventListener('click',function(){
    calc.value += btn2.value;
},false);
document.getElementById('btn3').addEventListener('click',function(){
    calc.value += btn3.value;
},false);
document.getElementById('btn4').addEventListener('click',function(){
    calc.value += btn4.value;
},false);
document.getElementById('btn5').addEventListener('click',function(){
    calc.value += btn5.value;
},false);
document.getElementById('btn6').addEventListener('click',function(){
    calc.value += btn6.value;
},false);
document.getElementById('btn7').addEventListener('click',function(){
    calc.value += btn7.value;
},false);
document.getElementById('btn8').addEventListener('click',function(){
    calc.value += btn8.value;
},false);
document.getElementById('btn9').addEventListener('click',function(){
    calc.value += btn9.value;
},false);


document.getElementById('btn10').addEventListener('click',function(){
    calc.value += btn10.value;
},false);
document.getElementById('btn11').addEventListener('click',function(){
    calc.value += btn11.value;
},false);
document.getElementById('btn12').addEventListener('click',function(){
    calc.value += btn12.value;
},false);
// document.getElementById('btn13').addEventListener('click',function(){
//     calc.value += btn13.value;
// },false);

document.getElementById('btn14').addEventListener('click',function(){
    calc.value += btn14.value;
},false);
document.getElementById('calc').addEventListener('click',function(){
    answer = eval(calc.value);
    calc.value = answer;
},false);
document.getElementById('btn15').addEventListener('click',function(){
    calc.value = '';
},false);
document.getElementById('btn16').addEventListener('click',function(){
    calc.value += btn16.value;
},false);
document.getElementById('btn17').addEventListener('click',function(){
    calc.value += btn17.value;
},false);
document.getElementById('btn18').addEventListener('click',function(){
    calc.value += btn18.value;
},false);
document.getElementById('btn19').addEventListener('click',function(){
    calc.value += btn19.value;
},false);
document.getElementById('btn20').addEventListener('click',function(){
    let x = eval(calc.value);
    calc.value = Math.sqrt(x);

},false);
document.getElementById('btn21').addEventListener('click',function(){
    let num = Math.floor(Math.random() * (9999 + 1 - 1) + 1);
    calc.value += num;
},false);

// console.log(clac.value);
// let num = Math.floor(Math.random() * (6 + 1 - 1) + 1);
// console.log(num);

document.getElementById('btn22').addEventListener('click',function(){
    let num = Math.floor(Math.random() * (7 + 1 - 1) + 1);  
    let img = document.getElementById('gazo'); 
    let img2 = document.getElementById('gazo2'); 
        img.src = `getImage%20(${num+1}).jpg`;
        img2.src = `getImage%20(${num}).jpg`;
},false);
document.getElementById('btn23').addEventListener('click',function(){
    let result = calc.value.substring(0,(calc.value.length)-1);
    calc.value = result;
},false);


document.getElementById('btn24').addEventListener('click',function(){
    let num = Math.floor(Math.random() * (9 + 1 - 1) + 1);
    calc.value += num;
},false);

