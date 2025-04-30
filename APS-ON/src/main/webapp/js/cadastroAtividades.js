// script.js

// Seleciona as abas
const apsTab = document.getElementById('aps-tab');
const epsTab = document.getElementById('eps-tab');

// Função para alternar abas
function switchTab(selectedTab) {
    if (selectedTab === 'APS') {
        apsTab.classList.add('active');
        epsTab.classList.remove('active');
    } else if (selectedTab === 'EPS') {
        epsTab.classList.add('active');
        apsTab.classList.remove('active');
    }
}

// Adiciona eventos de clique nas abas
apsTab.addEventListener('click', () => switchTab('APS'));
epsTab.addEventListener('click', () => switchTab('EPS'));
