package trpl.nim234311041.topiccourse.Data

import trpl.nim234311041.topiccourse.R
import trpl.nim234311041.topiccourse.Model.Topic

object DataSource {
    val topics = listOf(
        Topic(R.string.arsitektur, 58, R.drawable.arsitektur),
        Topic(R.string.otomotif, 30, R.drawable.otomotif),
        Topic(R.string.biologi, 90, R.drawable.biologi),
        Topic(R.string.bisnis, 78, R.drawable.bisnis),
        Topic(R.string.kuliner, 118, R.drawable.kuliner),
        Topic(R.string.desain, 423, R.drawable.desain),
        Topic(R.string.fashion, 92, R.drawable.fashion),
        Topic(R.string.film, 165, R.drawable.film),
        Topic(R.string.gaming, 37, R.drawable.gaming),
        Topic(R.string.seni, 326, R.drawable.seni),
        Topic(R.string.sejarah, 189, R.drawable.sejarah),
        Topic(R.string.jurnalistik, 96, R.drawable.jurnalistik),
        Topic(R.string.hukum, 58, R.drawable.hukum),
        Topic(R.string.musik, 212, R.drawable.musik),
        Topic(R.string.fotografi, 321, R.drawable.fotografi),
        Topic(R.string.tech, 118, R.drawable.tech),
    )
}