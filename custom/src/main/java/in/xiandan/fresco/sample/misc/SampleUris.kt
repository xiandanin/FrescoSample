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
            "http://s9.rr.itc.cn/r/wapChange/201610_11_18/a9fmon5981641135.png",//500x309
            "https://ww2.sinaimg.cn/mw690/5cfc088egw1e6vo8myce3g20au04vaoc.gif",//390x175
            "https://ww2.sinaimg.cn/mw690/5cfc088egw1e6vo8qumofg20au05x465.gif",//390x213
            "https://ww2.sinaimg.cn/mw690/5cfc088egw1e6vo8sv17hg20au065aiu.gif",//390x221
            "https://ww2.sinaimg.cn/mw690/5cfc088egw1e6vo8uprc8g20au088wjf.gif",//390x296
            "https://ww4.sinaimg.cn/mw690/5cfc088egw1e6vo94vslsg20a006oguz.gif",//360x240
            "https://ww1.sinaimg.cn/mw690/5cfc088egw1e6vo974a8og20au082wli.gif",//390x290
            "https://b-ssl.duitang.com/uploads/item/201704/03/20170403110923_3dREJ.gif",//800x600
            "http://image.thepaper.cn/www/image/5/324/952.gif",//420x299
            "https://a-ssl.duitang.com/uploads/item/201609/25/20160925133102_zNchQ.gif",//250x168
            "https://b-ssl.duitang.com/uploads/item/201508/15/20150815102038_cMhEF.gif",//700x525
            "https://b-ssl.duitang.com/uploads/item/201503/24/20150324220945_LtFHr.gif",//350x242
            "http://s9.rr.itc.cn/r/wapChange/201610_11_18/a8sgha6100111135.png",//350x265
            "https://b-ssl.duitang.com/uploads/item/201503/24/20150324221021_cAZ2U.gif",//350x257
            "http://5b0988e595225.cdn.sohucs.com/images/20180829/c6541777d8384af3bf0d80ae6b1e1486.gif",//500x309
            "https://b-ssl.duitang.com/uploads/item/201508/15/20150815103637_35f4y.gif",//500x341
            "https://b-ssl.duitang.com/uploads/item/201808/15/20180815150252_ljihj.gif",//496x280
            "http://13n.com/wp-content/uploads/2016/11/377346.gif",//500x375
            "https://b-ssl.duitang.com/uploads/item/201508/15/20150815103933_4hjVy.gif",//500x353
            "https://b-ssl.duitang.com/uploads/item/201601/26/20160126150421_T2UVj.gif",//500x200
    )

    private fun transform(source: String, size: Int): String {
        val regex = Regex("\\d*x\\d*")
        return when (
            val result = if (size <= 0) null else Regex("\\d*x\\d*").find(source)) {
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