package com.borshevskiy.plugins

import com.borshevskiy.routes.getAllHeroes
import com.borshevskiy.routes.root
import com.borshevskiy.routes.searchHeroes
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        searchHeroes()

        static("/images") {
            resources("images")
        }
    }
}
