package com.practica.agenda

class ItemProvider {
    companion object {
        val itemsList = listOf<Item>(
            // Ejemplos de tipo "serie" y "video"
            Item("Gambito de Dama", "serie", "https://www.netflix.com/ar/title/80234304", "cine"),
            Item("Twitch", "streaming", "https://www.twitch.tv/", "web"),

            // Ejemplo tipo "pelicula"
            Item("Inception", "pelicula", "https://www.netflix.com/ar/title/70131314", "cine"),
            Item("The Dark Knight", "pelicula", "https://www.netflix.com/ar/title/70079583", "cine"),
            // Ejemplo tipo "album" (por ejemplo, un álbum de música)
            Item("Abbey Road", "album", "https://www.spotify.com/album/abbey-road", "audio"),
            Item("Dark Side of the Moon", "album", "https://www.spotify.com/album/dark-side-of-the-moon", "audio"),

            // Ejemplo tipo "web"
            Item("Google", "web", "https://www.google.com", "web"),
            Item("Wikipedia", "web", "https://www.wikipedia.org", "web"),
            Item("YouTube", "web", "https://www.youtube.com", "web"),

            // Ejemplo tipo "foto"
            Item("Sunset", "foto", "https://example.com/sunset.jpg", "foto"),
            Item("Mountain View", "foto", "https://example.com/mountain.jpg", "foto"),
            Item("City Skyline", "foto", "https://example.com/city.jpg", "foto"),
                    // Ejemplos de tipo "serie" y "video"
            Item("Breaking Bad", "serie", "https://www.netflix.com/ar/title/70143836", "cine"),
            Item("Stranger Things", "serie", "https://www.netflix.com/ar/title/80057281", "cine"),
            Item("The Witcher", "serie", "https://www.netflix.com/ar/title/80189685", "cine"),

            // Ejemplo tipo "pelicula"
            Item("Avatar", "pelicula", "https://www.netflix.com/ar/title/70013606", "cine"),
            Item("The Matrix", "pelicula", "https://www.netflix.com/ar/title/20557971", "cine"),
            Item("Titanic", "pelicula", "https://www.netflix.com/ar/title/70000801", "cine"),
            Item("The Godfather", "pelicula", "https://www.netflix.com/ar/title/60011152", "cine"),

            // Ejemplo tipo "documento" (por ejemplo, un documento PDF)
            Item("Informe de Proyecto", "documento", "https://example.com/informe.pdf", "documento"),



            // Ejemplo tipo "web"
            Item("GitHub", "web", "https://github.com", "web"),
            Item("Stack Overflow", "web", "https://stackoverflow.com", "web"),
            Item("Reddit", "web", "https://www.reddit.com", "web"),
            Item("Twitter", "web", "https://twitter.com", "web"),

            // Ejemplo tipo "foto"
            Item("Beach", "foto", "https://example.com/beach.jpg", "foto"),
            Item("Forest", "foto", "https://example.com/forest.jpg", "foto"),
            Item("City Night", "foto", "https://example.com/citynight.jpg", "foto"),
            Item("Desert", "foto", "https://example.com/desert.jpg", "foto"),




        )

    }
}