package ai.motora.driver_analytics_api_client.repositories

import ai.motora.driver_analytics_api_client.entities.Pokemon
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.utils.io.errors.*
import kotlinx.serialization.json.Json

class PokemonRepository {
    private val httpClient = HttpClient{
        install(ContentNegotiation){
            json(Json{
                ignoreUnknownKeys = true
            })
        }
    }

    suspend fun getPokemon(index: Int) : Pokemon{
        val response: HttpResponse = httpClient.get("https://pokeapi.co/api/v2/pokemon/$index")

        when(response.status){
            HttpStatusCode.OK -> return response.body()
            else -> throw IOException("Dados não puderam ser adquiridos")
        }
    }
}