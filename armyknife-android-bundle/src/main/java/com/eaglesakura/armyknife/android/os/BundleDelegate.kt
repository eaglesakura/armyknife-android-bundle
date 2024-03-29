package com.eaglesakura.armyknife.android.os

import android.os.Bundle
import android.os.Parcelable
import com.eaglesakura.armyknife.android.extensions.getMarshalParcelable
import com.eaglesakura.armyknife.android.extensions.putMarshalParcelable
import kotlin.reflect.KProperty

internal class BundleIntExtra(
    private val bundle: Bundle,
    private val key: String,
    private val defValue: Int
) :
    BundleExtra<Int> {
    override operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return bundle.getInt(key, defValue)
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        bundle.putInt(key, value)
    }
}

internal class BundleLongExtra(
    private val bundle: Bundle,
    private val key: String,
    private val defValue: Long
) :
    BundleExtra<Long> {
    override operator fun getValue(thisRef: Any?, property: KProperty<*>): Long {
        return bundle.getLong(key, defValue)
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Long) {
        bundle.putLong(key, defValue)
    }
}

internal class BundleFloatExtra(
    private val bundle: Bundle,
    private val key: String,
    private val defValue: Float
) :
    BundleExtra<Float> {
    override operator fun getValue(thisRef: Any?, property: KProperty<*>): Float {
        return bundle.getFloat(key, defValue)
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Float) {
        bundle.putFloat(key, defValue)
    }
}

internal class BundleDoubleExtra(
    private val bundle: Bundle,
    private val key: String,
    private val defValue: Double
) :
    BundleExtra<Double> {

    override operator fun getValue(thisRef: Any?, property: KProperty<*>): Double {
        return bundle.getDouble(key, defValue)
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Double) {
        bundle.putDouble(key, value)
    }
}

internal class BundleStringExtra(
    private val bundle: Bundle,
    private val key: String,
    private val defValue: String
) :
    BundleExtra<String> {
    override operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return bundle.getString(key, defValue)
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        bundle.putString(key, value)
    }
}

internal class BundleByteArrayExtra(
    private val bundle: Bundle,
    private val key: String
) : BundleExtra<ByteArray?> {
    override operator fun getValue(thisRef: Any?, property: KProperty<*>): ByteArray? {
        return bundle.getByteArray(key)
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: ByteArray?) {
        bundle.putByteArray(key, value)
    }
}

internal class BundleInBundleExtra(
    private val bundle: Bundle,
    private val key: String
) :
    BundleExtra<Bundle?> {
    override operator fun getValue(thisRef: Any?, property: KProperty<*>): Bundle? {
        return bundle.getBundle(key)
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Bundle?) {
        bundle.putBundle(key, value)
    }
}

internal class BundleParcelableExtra<T : Parcelable>(
    private val bundle: Bundle,
    private val key: String
) :
    BundleExtra<T?> {
    override operator fun getValue(thisRef: Any?, property: KProperty<*>): T? {
        return bundle.getParcelable(key)
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
        bundle.putParcelable(key, value)
    }
}

internal class BundleMarshalParcelableExtra<T : Parcelable>(
    private val bundle: Bundle,
    private val key: String
) :
    BundleExtra<T?> {
    override operator fun getValue(thisRef: Any?, property: KProperty<*>): T? {
        return bundle.getMarshalParcelable(key)
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
        bundle.putMarshalParcelable(key, value)
    }
}