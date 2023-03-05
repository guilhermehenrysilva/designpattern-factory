CREATE TABLE recurso_projeto (
    tipo_recurso VARCHAR(255) NOT NULL,
    id INTEGER NOT NULL AUTO_INCREMENT,
    custo_hora DECIMAL(19,2),
    responsabilidade VARCHAR(255),
    descricao VARCHAR(255),
    nome VARCHAR(255),
    email VARCHAR(255),

    PRIMARY KEY (id)
);