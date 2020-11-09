package dev.secondsun.tm4e.core;

import dev.secondsun.tm4e.core.internal.oniguruma.OnigString;
import org.junit.Assert;
import org.junit.Test;

public class OnigStringTest {

	@Test
	public void testUtf8Utf16Conversions() {
		OnigString onigString = new OnigString("áé");
		Assert.assertEquals(onigString.utf8_value.length, 4);
		Assert.assertEquals(onigString.string.length(), 2);
		Assert.assertEquals(onigString.convertUtf8OffsetToUtf16(0), 0);
	}

	@Test
	public void testUtf8Utf16Conversions2() {

        String string = "myááçóúôõaab";
        OnigString utf8WithCharLen = new OnigString(string);

        Assert.assertEquals(0, utf8WithCharLen.convertUtf16OffsetToUtf8(0));
        Assert.assertEquals(1, utf8WithCharLen.convertUtf16OffsetToUtf8(1));
        Assert.assertEquals(2, utf8WithCharLen.convertUtf16OffsetToUtf8(2));
        Assert.assertEquals(4, utf8WithCharLen.convertUtf16OffsetToUtf8(3));
        Assert.assertEquals(6, utf8WithCharLen.convertUtf16OffsetToUtf8(4));
        Assert.assertEquals(8, utf8WithCharLen.convertUtf16OffsetToUtf8(5));
        Assert.assertEquals(10, utf8WithCharLen.convertUtf16OffsetToUtf8(6));
        Assert.assertEquals(12, utf8WithCharLen.convertUtf16OffsetToUtf8(7));
        try {
            utf8WithCharLen.convertUtf16OffsetToUtf8(55);
            Assert.fail("Expected error");
        } catch (ArrayIndexOutOfBoundsException e) {
        }

        Assert.assertEquals(0, utf8WithCharLen.convertUtf8OffsetToUtf16(0));
        Assert.assertEquals(1, utf8WithCharLen.convertUtf8OffsetToUtf16(1));
        Assert.assertEquals(2, utf8WithCharLen.convertUtf8OffsetToUtf16(2));
        Assert.assertEquals(2, utf8WithCharLen.convertUtf8OffsetToUtf16(3));
        Assert.assertEquals(3, utf8WithCharLen.convertUtf8OffsetToUtf16(4));
        Assert.assertEquals(3, utf8WithCharLen.convertUtf8OffsetToUtf16(5));
        Assert.assertEquals(4, utf8WithCharLen.convertUtf8OffsetToUtf16(6));
        Assert.assertEquals(4, utf8WithCharLen.convertUtf8OffsetToUtf16(7));
        Assert.assertEquals(5, utf8WithCharLen.convertUtf8OffsetToUtf16(8));
        Assert.assertEquals(6, utf8WithCharLen.convertUtf8OffsetToUtf16(10));
        Assert.assertEquals(7, utf8WithCharLen.convertUtf8OffsetToUtf16(12));
        try {
            utf8WithCharLen.convertUtf8OffsetToUtf16(55);
            Assert.fail("Expected error");
        } catch (ArrayIndexOutOfBoundsException e) {
        }

	}
}
