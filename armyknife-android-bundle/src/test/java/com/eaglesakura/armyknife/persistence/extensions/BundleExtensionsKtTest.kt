package com.eaglesakura.armyknife.persistence.extensions

import android.os.Bundle
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BundleExtensionsKtTest {

    @Test
    fun delegateIntExtra() {
        val example = ExampleBundle(Bundle())
        assertEquals(123, example.intExtra)
        example.intExtra = 234
        assertEquals(234, example.intExtra)
    }

    @Test
    fun delegateStringExtra() {
        val example = ExampleBundle(Bundle())
        assertEquals("default", example.stringExtra)
        example.stringExtra = "modify"
        assertEquals("modify", example.stringExtra)
    }

    data class ExampleBundle(
        val bundle: Bundle
    ) {
        var intExtra by bundle.delegateIntExtra("intExtra", 123)

        var stringExtra by bundle.delegateStringExtra("stringExtra", "default")
    }
}