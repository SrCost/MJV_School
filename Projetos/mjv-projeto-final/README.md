# MJV Projeto Final

#### Autor

- [Flávio Costa](https://github.com/SrCost)

Repositório contendo o código fonte de projeto Pedido Fast
Praticando os conhecimentos absorvidos no curso, desenvolver uma API Rest, documentada utilizando o Swagger e com pelo menos 3 testes unitários.

* OBS: Em desenvolvimento
  * Objetivo:
    * Gerar - Playlist
      * Junção PlaylistXMusicas 

##### Tecnologias

* Java
* JPA Hibernate
* MySQL
* Spring Boot
* Swagger

##### Apresentação

1. Criar de Playlist
2. Inserção de musicas
3. Cadastro de usuarios
4. Inclusão de musicas nas Playlists

##### JSON Cadastros -Testes a serem efetuados

* Cadastrando Musica - 01
{
  "artista": "Chrs Brown",
  "nomeMusica": "kissKiss",
  "album": "Loyal",
  "gravadora": "Warner",
  "valor": "2.88",
  "id": 0,
  "generoMusical": "HIPHOP"
}

* Cadastrando Musica - 02
{
    "artista": "Roberto carlos",
    "nomeMusica": "Portão",
    "album": "vermelho",
    "gravadora": "Sony",
    "valor": 1.12,
    "id": 0,
    "generoMusical": "MPB"
  },
* Cadastrando Musica - 03
  {
    "artista": null,
    "nomeMusica": "Vai Doer Mais ",
    "album": "Aleatorio",
    "gravadora": "microsoft",
    "valor": null,
    "id": 2,
    "generoMusical": "FUNK"
  },

###### Deletar
curl -X 'DELETE' \
  'http://localhost:8080/musicas/{id_musica}?id_musica=7' \
  -H 'accept: */*'
http://localhost:8080/musicas/{id_musica}?id_musica=7


###### Buscar 
curl -X 'GET' \
  'http://localhost:8080/musicas' \
  -H 'accept: */*'
  
  [
  {
    "artista": "Roberto carlos",
    "nomeMusica": "Portão",
    "album": "vermelho",
    "gravadora": "Sony",
    "valor": 1.12,
    "id": 0,
    "generoMusical": "MPB"
  },
  {
    "artista": null,
    "nomeMusica": "Para de Me Assistir",
    "album": "Vasnista",
    "gravadora": "sony",
    "valor": null,
    "id": 1,
    "generoMusical": "SERTANEJO"
  },
  {
    "artista": null,
    "nomeMusica": "Vai Doer Mais ",
    "album": "Aleatorio",
    "gravadora": "microsoft",
    "valor": null,
    "id": 2,
    "generoMusical": "FUNK"
  },
  {
    "artista": null,
    "nomeMusica": "Intuição ",
    "album": "intuicao",
    "gravadora": "warner",
    "valor": null,
    "id": 15,
    "generoMusical": "POP"
  },
  {
    "artista": null,
    "nomeMusica": "Basiquinho",
    "album": "Brasicaliando",
    "gravadora": "warner",
    "valor": null,
    "id": 3,
    "generoMusical": "BLUES"
  },
  
###### Alterando 
curl -X 'PUT' \
  'http://localhost:8080/musicas' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "artista": "Destiny Child",
  "nomeMusica": "Cater 2 U",
  "album": "4D",
  "gravadora": "Sony",
  "valor": 99,
  "id": 0,
  "generoMusical": "HIPHOP"
}'
