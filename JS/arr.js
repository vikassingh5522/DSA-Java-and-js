

console.log(1 + "2" + 3);
123

let a;
console.log(a == undefined, a===undefined);
true true 

function test(){
  console.log(x);
  var x =5;
}
test();
undefined

confirm.log([1,2] == [1,2]);  flase --> refrence not same

for (var i = 0; i < 3; i++) {
  setTimeout(() => console.log(i), 1000);
}
 3 3 3 