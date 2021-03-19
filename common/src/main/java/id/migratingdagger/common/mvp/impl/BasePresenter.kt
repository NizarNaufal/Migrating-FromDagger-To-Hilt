package id.migratingdagger.common.mvp.impl

import androidx.annotation.CallSuper
import id.migratingdagger.common.mvp.Model
import id.migratingdagger.common.mvp.Presenter
import id.migratingdagger.common.mvp.View

/**
 * Base class for Presenters
 */
abstract class BasePresenter<M : Model, V : View<M>> : Presenter<M, V> {

    /**
     * The View
     */
    private var view: V? = null

    @CallSuper
    override fun bind(v: V) {
        view = v
    }


    @CallSuper
    override fun unbind() {
        view = null
    }
}