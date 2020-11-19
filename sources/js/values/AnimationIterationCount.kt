@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface AnimationIterationCount : CssValue.NumberConstructable, Internal {

	public companion object {

		@CssDsl
		public val infinite: AnimationIterationCount = raw("infinite")


		public inline fun of(value: Number): AnimationIterationCount =
			raw(value.toString())


		public fun raw(value: String): AnimationIterationCount =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : AnimationIterationCount, CssVariable<AnimationIterationCount>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: AnimationIterationCount) {
	property(animationIterationCount, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.animationIterationCount(value: Number) {
	property(animationIterationCount, value)
}


@Suppress("unused")
public inline val CssProperties.animationIterationCount: CssProperty<AnimationIterationCount>
	get() = CssProperty("animation-iteration-count")
