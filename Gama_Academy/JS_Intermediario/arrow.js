//simples SEM arrow function
function soma (x,y){
    return x+ y;
}

console.log(soma(3, 4));

//criando variavel que guarda função
const multiplicao = function (x, y){
    return x * y;
};
//para invocar a função, basta invocar o nome a variavel
console.log(multiplicao(5, 5));

//ARROW FUNCTION
// o uso de '()' declara que será uma fnução
const dividir = (x, y) => {
    return x / y;
}

//construção dinamica de objetos
//quando tenho uma função anonima que resulta o retorno de um objeto é preciso encapsula-lo entre parenteses
const objeto = () => ({ nome: 'Ruth', sobrenome: 'Ferreira' });

