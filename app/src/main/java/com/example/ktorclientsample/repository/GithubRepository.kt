package com.example.ktorclientsample.repository

import com.example.ktorclientsample.repository.response.Repo
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.features.json.GsonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.request.get

class GithubRepository {

    val client = HttpClient(Android) {
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
    }

    suspend fun getRepo(): List<Repo> {
        return client.get("https://api.github.com/users/sobaya-0141/repos")
    }
}
