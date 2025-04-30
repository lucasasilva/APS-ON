


// Função que é chamada quando o usuário clica no botão "Login"
function login() {
    const login = document.getElementById('username').value;
    const senha = document.getElementById('password').value;

    const response =  fetch('http://localhost:9100/APS-ON/api/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            login: login,
            senha: senha
        })
    });

    if (response.ok) {
        // Login certo, redireciona para a próxima página
        window.location.href = './menu.html';
    } else {
        // Login errado, mostra mensagem de erro
        alert('Login ou senha incorretos!');
    }

}

// Função que carrega os dados salvos do localStorage ao abrir a página
function loadSavedData() {

}

// Chama a função para carregar dados assim que a página é carregada
window.onload = loadSavedData;
