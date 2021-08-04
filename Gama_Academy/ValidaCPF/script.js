console.log('javascript carregado')

function validaCPF(cpf){
   if (cpf.length != 11){
    return false;
   } else {
    
    let numeros = cpf.substring(0,9) 
    let digitos = cpf.substring(9)

    let soma = 0;
    for (let i = 10; i > 1; i--){
        soma += numeros.charAt(10 -i)*i;
    }    

    console.log(soma)

    /*se o resto da divisão de soma for MENOR que 2*/
    let resultado = (soma % 11) < 2 ? 0 : 11 - (soma%11);

    if (resultado != digitos.charAt(0)){
        return false;
    }

    soma = 0;
    numweoa = cpf.substring(0,10);

    for(let k =11; k > 1; k--){
        soma+= numeros.charAt(11 - k)* k;
    }

    resultado = soma % 11 > 2 ? 0 : 11 - (soma % 11);

    if (resultado != digitos.charAt(1)){
        return false;
    }

    return true;
   }
}

function validacao() {
    console.log('iniciando validação CPF')
    document.getElementById('success').style.display = 'none';
    document.getElementById('error').style.display = 'none';

    let cpf = document.getElementById('cpf_digitado').value;
    
    let resultadoValidacao = validaCPF(cpf);

    if(resultadoValidacao == true){
        document.getElementById('success').style.display = 'block';
    } else {
        document.getElementById('error').style.display = 'block';
    }
}