package info.nightscout.androidaps.plugins.pump.eopatch.vo

import info.nightscout.shared.sharedPreferences.SP
import io.reactivex.Observable

interface IPreference<T>{
    fun flush(sp: SP)
    fun observe(): Observable<T>
}