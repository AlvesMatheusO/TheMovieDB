package com.example.filmes.Models

class Filme {
    var popularity: Double? = 0.0
    var id: Int = 0
    var video: Boolean = false
    var vote_count: Int = 0
    var vote_average: Double? = 0.0
    var title: String = ""
    var release_date: String = ""
    var original_language: String = ""
    var original_title: String = ""
    var genre_ids: MutableList<Int> = mutableListOf()
    var backdrop_path: String = ""
    var adult: Boolean = false
    var overview: String = ""
    var poster_path: String = ""

}