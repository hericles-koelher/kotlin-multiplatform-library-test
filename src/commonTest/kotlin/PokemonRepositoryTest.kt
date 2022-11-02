import ai.motora.driver_analytics_api_client.repositories.PokemonRepository
import kotlinx.coroutines.*
import kotlin.test.Test

class PokemonRepositoryTest {

    @Test
    fun getBulbassaur()= runBlocking{
        val bulbassaur = PokemonRepository().getPokemon(1)

        println(bulbassaur)
    }
}