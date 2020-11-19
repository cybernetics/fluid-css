@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support multiple values


public interface BackgroundRepeat : CssValue, Internal {

	public companion object {

		@CssDsl
		public inline val noRepeat: BackgroundRepeat
			get() = BackgroundRepeatAxis.noRepeat

		@CssDsl
		public inline val repeat: BackgroundRepeat
			get() = BackgroundRepeatAxis.repeat

		@CssDsl
		public val repeatX: BackgroundRepeat = raw("repeat-x")

		@CssDsl
		public val repeatY: BackgroundRepeat = raw("repeat-y")

		@CssDsl
		public inline val round: BackgroundRepeat
			get() = BackgroundRepeatAxis.round

		@CssDsl
		public inline val space: BackgroundRepeat
			get() = BackgroundRepeatAxis.space


		public fun raw(value: String): BackgroundRepeat =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public inline fun with(x: BackgroundRepeatAxis, y: BackgroundRepeatAxis): BackgroundRepeat =
			raw("$x $y")
	}


	public interface Variable : BackgroundRepeat, CssVariable<BackgroundRepeat>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundRepeat(value: BackgroundRepeat) {
	property(backgroundRepeat, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundRepeat(x: BackgroundRepeatAxis, y: BackgroundRepeatAxis) {
	backgroundRepeat(BackgroundRepeat.with(x, y))
}


@Suppress("unused")
public inline val CssProperties.backgroundRepeat: CssProperty<BackgroundRepeat>
	get() = CssProperty("background-repeat")
