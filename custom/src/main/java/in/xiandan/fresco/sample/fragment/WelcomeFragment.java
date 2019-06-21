/*
 * This file provided by Facebook is for non-commercial testing and evaluation
 * purposes only.  Facebook reserves all rights not expressly granted.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * FACEBOOK BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package in.xiandan.fresco.sample.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.facebook.drawee.view.SimpleDraweeView;

import in.xiandan.fresco.sample.BaseCustomFragment;
import in.xiandan.fresco.sample.R;

/**
 * Fragment shown on start-up
 */
public class WelcomeFragment extends BaseCustomFragment {


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_welcome;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        final SimpleDraweeView draweeView = (SimpleDraweeView) view.findViewById(R.id.drawee_view);
        draweeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final RotateAnimation rotateAnimation = new RotateAnimation(
                        0,
                        360,
                        Animation.RELATIVE_TO_SELF,
                        0.5f,
                        Animation.RELATIVE_TO_SELF,
                        0.5f);
                rotateAnimation.setDuration(1000);
                rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                draweeView.startAnimation(rotateAnimation);
            }
        });

        final TextView buttonGitHub = (TextView) view.findViewById(R.id.button_github);
        setUriIntent(buttonGitHub, R.string.welcome_label_github);

        final TextView buttonArticle = (TextView) view.findViewById(R.id.button_article);
        setUriIntent(buttonArticle, R.string.welcome_label_article);

        final TextView buttonDocumentation = (TextView) view.findViewById(R.id.button_documentation);
        setUriIntent(buttonDocumentation,R.string.welcome_label_doc);
    }

    private void setUriIntent(final View button, final int resId) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(getString(resId)));
                startActivity(i);
            }
        });
    }

    @Override
    public int getTitleId() {
        return R.string.welcome_title;
    }
}
