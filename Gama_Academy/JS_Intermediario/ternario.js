//expresão feita sem ternário
let isValid = true;

function verify(isValid){
    //isValid==true
    if(isValid){
        return true
    } else {
        return false
    }
}
console.log(verify(isValid));

//expressão COM TERNÁRIO

//o result é verdadeiro ? SE SIM TRUE --- SE NÃO FALSE
const result = isValid ? true : false;

let num = 0;

// a variavel num é maior que 0 ? 
// SE SIM atribuo o valor 0 para ela
// SE NÃO atribuo o valor -1
const numeroResultado = num > 0 ? 0 : -1 
console.log(numeroResultado)