// Função responsável por consultar os usuários cadastrados na API Java.
function carregarUsuarios() {

    // Realiza uma requisição HTTP GET para o endpoint do Spring Boot.
    fetch("http://localhost:8080/usuarios")

        // Recebe a resposta HTTP do servidor.
        .then(response => {

            // Verifica se a requisição foi concluída com sucesso.
            if (!response.ok) {

                // Interrompe o processamento e gera um erro com o status HTTP.
                throw new Error(`Erro HTTP: ${response.status}`);
            }

            // Converte o corpo da resposta JSON em um objeto JavaScript.
            return response.json();

        })

        // Recebe a lista de usuários convertida em JavaScript.
        .then(usuarios => {

            // Limpa o conteúdo anterior do container HTML.
            containerUsuarios.replaceChildren();

            // Verifica se a lista retornada está vazia.
            if (usuarios.length === 0) {

                // Exibe uma mensagem caso não existam usuários cadastrados.
                containerUsuarios.textContent = "Nenhum usuário cadastrado.";

                // Encerra a execução desta etapa da função.
                return;
            }

            // Percorre cada usuário presente no array recebido da API.
            usuarios.forEach(usuario => {

                // Cria uma div para representar cada usuário.
                const item = document.createElement("div");

                // Adiciona uma classe CSS para permitir a estilização.
                item.classList.add("usuario-item");

                // Cria um elemento HTML para exibir o nome.
                const nome = document.createElement("h3");

                // Insere o nome recebido do backend no elemento HTML.
                nome.textContent = usuario.nome;

                // Cria um parágrafo para exibir o e-mail.
                const email = document.createElement("p");

                // Insere o e-mail recebido da API.
                email.textContent = usuario.email;

                // Cria um elemento pequeno para exibir o identificador.
                const id = document.createElement("small");

                // Insere o ID do usuário no elemento HTML.
                id.textContent = `ID: ${usuario.id}`;

                // Adiciona nome, e-mail e ID dentro da div do usuário.
                item.append(nome, email, id);

                // Adiciona a div completa dentro do container principal.
                containerUsuarios.appendChild(item);

            });

        })

        // Captura erros de comunicação ou de processamento da requisição.
        .catch(error => {

            // Exibe os detalhes do erro no console do navegador.
            console.error("Erro:", error);

            // Informa visualmente ao usuário que a consulta falhou.
            containerUsuarios.textContent =
                "Não foi possível carregar os usuários.";

        });
}


// Executa a função para iniciar a consulta à API.
carregarUsuarios();





