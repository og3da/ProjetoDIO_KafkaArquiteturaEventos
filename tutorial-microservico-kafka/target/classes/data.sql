CREATE TABLE IF NOT EXISTS Produtos (
    codigo VARCHAR(255) PRIMARY KEY NOT NULL,
    nomeProduto VARCHAR(255) NOT NULL,
    valor DOUBLE NOT NULL
);

INSERT INTO Produtos (codigo, nomeProduto, valor) VALUES
    ('1', 'teste', 10.00);
