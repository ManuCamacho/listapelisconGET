package com.example.listapelisconget

class FilmProvider {
    companion object {
        val filmList = listOf<Film>(
            Film(
                film = "Lightyear",
                photo = "https://i.blogs.es/4d611c/lightyear-cartel/1366_2000.jpeg"
            ),
            Film(
                film = "American Pie",
                photo = "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/1200/public/media/image/2016/12/american-pie.jpg?itok=wBQoOMY9"
            ),
            Film(
                film = "Joker",
                photo = "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/5c49f890a63f4cc0480374a0905257a97f506e681d98347a7b5175beb19c176d._RI_V_TTW_.jpg"
            ),
            Film(
                film = "Sonic 2",
                photo = "https://www.gamereactor.es/media/83/checkoutmovie_3748303.jpg"
            ),
            Film(
                film = "El rey Leon",
                photo = "https://static.wikia.nocookie.net/doblaje/images/e/e0/Lion_king_1.jpg/revision/latest?cb=20200726001925&path-prefix=es"
            ),


            )
    }
}