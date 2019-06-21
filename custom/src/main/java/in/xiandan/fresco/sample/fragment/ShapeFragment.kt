package `in`.xiandan.fresco.sample.fragment

import `in`.xiandan.fresco.sample.BaseCustomFragment
import `in`.xiandan.fresco.sample.R
import `in`.xiandan.fresco.sample.misc.SampleUris
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_shape.*

/**
 * 本页面演示了如何用Fresco实现图片的形状
 * @author  dengyuhan
 * created 2019-06-21 18:06
 */
class ShapeFragment : BaseCustomFragment() {
    override fun getTitleId(): Int {
        return R.string.shape_title
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_shape
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        drawee_round_static.setImageURI(SampleUris.createStatic())
        drawee_round_animated.setImageURI(SampleUris.createAnimated())
    }
}