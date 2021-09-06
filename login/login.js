let ck = document.getElementById('check');

let img =document.getElementById('quiz');
let attrs = quiz.attributes;

let gazo = document.createElement('img');
ck.addEventListener('click',function(){
  // window.alert('本当に人間ですか？');
  attrs[0].value='tako.png';
  // console.log(attrs[0].value);
  let a = attrs[0].value;


  gazo.src =  a;
  let list =document.getElementById('list');
  list.appendChild(gazo);

});
// width="200px" height="200px"
//画像をクリックすると回数を数えてくれる
// ログインの画像商人みたいなやつで、画像を表示して、その画像に点数がついてて、それ以上の点数になったら、ログインできるようにするのを作りたい
let sum = 0;
quiz.addEventListener('click',function(){
  sum++;
  console.log(sum);
  
  if(sum>0){
    let gazo2 = document.createElement('img');
     attrs[0].value='tako.png';
    let a = attrs[0].value;
    gazo2.src =  a;
    let list =document.getElementById('list');
    list.appendChild(gazo);
  }else{
    console.log('画像は押されていません。');
  }
});

