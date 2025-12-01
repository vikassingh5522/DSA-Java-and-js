
let prompt = require("prompt-sync")();

let p = prompt("Enter the principle:  ");
let r =prompt("Enter the rate o interest : ");
let t =prompt("Enter Time :  ");

console.log((p*Math.pow(1+(r/100),t) - p).toFixed(2));

