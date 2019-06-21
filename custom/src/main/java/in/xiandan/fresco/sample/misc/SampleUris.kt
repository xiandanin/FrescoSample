package `in`.xiandan.fresco.sample.misc

import kotlin.random.Random

/**
 * @author  dengyuhan
 * created 2019-06-21 16:57
 */
object SampleUris {

    //val IMAGE_SIZE_SMALL = CustomApplication.getResources().getDimensionPixelSize(R.dimen.drawee_width_small)
    //val IMAGE_SIZE_MEDIUM = CustomApplication.getResources().getDimensionPixelSize(R.dimen.drawee_width_medium)
    //val IMAGE_SIZE_LARGE = CustomApplication.getResources().getDimensionPixelSize(R.dimen.drawee_width_large)

    val IMAGE_SIZE_SMALL = "320x240"
    val IMAGE_SIZE_MEDIUM = "640x480"
    val IMAGE_SIZE_LARGE = "800x600"

    val URLS_STATIC = arrayOf(
        "https://cn.bing.com/th?id=OHR.HawksbillCrag_ZH-CN4429681235_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.CommonSundewVosges_ZH-CN0507660055_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.CherryLaurelMaze_ZH-CN9887470516_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.HelixPomatia_ZH-CN9785223494_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.AlaskaEagle_ZH-CN9957205086_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.PantheraLeoDad_ZH-CN9580668524_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SaskFlowers_ZH-CN9497517721_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.TreeFrog_ZH-CN9016355758_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.CommonSundewVosges_ZH-CN0507660055_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.CherryLaurelMaze_ZH-CN9887470516_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.HelixPomatia_ZH-CN9785223494_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.AlaskaEagle_ZH-CN9957205086_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.PantheraLeoDad_ZH-CN9580668524_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SaskFlowers_ZH-CN9497517721_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.TreeFrog_ZH-CN9016355758_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SainteVictoireCezanneBirthday_ZH-CN8216109812_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.CherryLaurelMaze_ZH-CN9887470516_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.HelixPomatia_ZH-CN9785223494_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.AlaskaEagle_ZH-CN9957205086_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.PantheraLeoDad_ZH-CN9580668524_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SaskFlowers_ZH-CN9497517721_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.TreeFrog_ZH-CN9016355758_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SainteVictoireCezanneBirthday_ZH-CN8216109812_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.RioGrande_ZH-CN8091224199_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.HelixPomatia_ZH-CN9785223494_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.AlaskaEagle_ZH-CN9957205086_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.PantheraLeoDad_ZH-CN9580668524_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SaskFlowers_ZH-CN9497517721_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.TreeFrog_ZH-CN9016355758_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SainteVictoireCezanneBirthday_ZH-CN8216109812_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.RioGrande_ZH-CN8091224199_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.FujiSakura_ZH-CN8005792871_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.AlaskaEagle_ZH-CN9957205086_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.PantheraLeoDad_ZH-CN9580668524_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SaskFlowers_ZH-CN9497517721_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.TreeFrog_ZH-CN9016355758_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SainteVictoireCezanneBirthday_ZH-CN8216109812_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.RioGrande_ZH-CN8091224199_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.FujiSakura_ZH-CN8005792871_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.PontadaPiedade_ZH-CN7717691454_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.PantheraLeoDad_ZH-CN9580668524_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SaskFlowers_ZH-CN9497517721_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.TreeFrog_ZH-CN9016355758_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SainteVictoireCezanneBirthday_ZH-CN8216109812_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.RioGrande_ZH-CN8091224199_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.FujiSakura_ZH-CN8005792871_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.PontadaPiedade_ZH-CN7717691454_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.OntWarbler_ZH-CN7999782156_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SaskFlowers_ZH-CN9497517721_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.TreeFrog_ZH-CN9016355758_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.SainteVictoireCezanneBirthday_ZH-CN8216109812_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.RioGrande_ZH-CN8091224199_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.FujiSakura_ZH-CN8005792871_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.PontadaPiedade_ZH-CN7717691454_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.OntWarbler_ZH-CN7999782156_1920x1080.jpg",
        "https://cn.bing.com/th?id=OHR.Biorocks_ZH-CN7851264095_1920x1080.jpg"
    )

    val URLS_ANIMATED = arrayOf(
        ""
    )

    private fun transform(source: String, size: Int): String {
        val regex = Regex("\\d*x\\d*")
        return when (val result = if (size <= 0) null else Regex("\\d*x\\d*").find(source)) {
            null -> source
            else -> {
                val sourceSize = result.value.split("x")
                val iw = sourceSize[0].toInt()
                val ih = sourceSize[1].toInt()
                return regex.replace(source,
                    when {
                        iw > ih -> {
                            val width = size.toDouble() / ih * iw
                            "${width.toInt()}x$size"
                        }
                        else -> {
                            val height = size.toDouble() / iw * ih
                            "${size}x${height.toInt()}"
                        }
                    })
            }
        }
    }


    private fun transform(source: String, size: String): String {
        val regex = Regex("\\d*x\\d*")
        if (IMAGE_SIZE_SMALL == size || IMAGE_SIZE_MEDIUM == size || IMAGE_SIZE_LARGE == size) {
            val result = regex.find(source)
            return when {
                result != null -> regex.replace(source, size)
                else -> source
            }
        }
        return source
    }

    fun createStatic(size: String = SampleUris.IMAGE_SIZE_MEDIUM): String {
        return SampleUris.transform(URLS_STATIC[Random.nextInt(URLS_STATIC.size)], size)
    }

    fun createAnimated(size: String = SampleUris.IMAGE_SIZE_MEDIUM): String {
        return SampleUris.transform(URLS_ANIMATED[Random.nextInt(URLS_ANIMATED.size)], size)
    }
}