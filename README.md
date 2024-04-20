O projeto tem por finalidade manipular informações da API do IBGE, simulando o cadastro de municípios,população,etc.

Aqui está um exemplo de json para dar o POST:

{
    "populacao":6000000,
    "idh":0.82,
    "uf":"SC",
    "capital":"Florianópolis",
    "municipio":[
        {
        "nome":"Criciúma",
        "populacao":200000
         },
        {"nome":"Araranguá",
        "populacao":100000
        },
        {"nome":"Cocal Do Sul",
        "populacao":15000
        }
    ]
}
