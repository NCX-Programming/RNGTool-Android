package com.ncxprogramming.rngtool

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.ncxprogramming.rngtool.ui.theme.md_theme_light_primary

@Composable
fun rememberTag(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "tag",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12f, 33.25f)
                quadToRelative(-0.625f, 0f, -1.021f, -0.479f)
                quadToRelative(-0.396f, -0.479f, -0.187f, -1.104f)
                lineToRelative(1.333f, -5.375f)
                horizontalLineTo(7.583f)
                quadToRelative(-0.625f, 0f, -1.041f, -0.5f)
                quadToRelative(-0.417f, -0.5f, -0.209f, -1.125f)
                quadToRelative(0.084f, -0.417f, 0.438f, -0.709f)
                quadToRelative(0.354f, -0.291f, 0.812f, -0.291f)
                horizontalLineToRelative(5.209f)
                lineToRelative(1.833f, -7.375f)
                horizontalLineTo(9.25f)
                quadToRelative(-0.625f, 0f, -1.042f, -0.5f)
                quadToRelative(-0.416f, -0.5f, -0.208f, -1.125f)
                quadToRelative(0.083f, -0.417f, 0.438f, -0.709f)
                quadToRelative(0.354f, -0.291f, 0.812f, -0.291f)
                horizontalLineToRelative(6.042f)
                lineToRelative(1.5f, -5.959f)
                quadToRelative(0.083f, -0.416f, 0.416f, -0.708f)
                quadToRelative(0.334f, -0.292f, 0.792f, -0.292f)
                quadToRelative(0.625f, 0f, 0.979f, 0.5f)
                reflectiveQuadToRelative(0.229f, 1.084f)
                lineToRelative(-1.333f, 5.375f)
                horizontalLineToRelative(7.417f)
                lineToRelative(1.5f, -5.959f)
                quadToRelative(0.083f, -0.416f, 0.416f, -0.708f)
                quadToRelative(0.334f, -0.292f, 0.792f, -0.292f)
                quadToRelative(0.625f, 0f, 0.979f, 0.5f)
                reflectiveQuadToRelative(0.229f, 1.084f)
                lineToRelative(-1.333f, 5.375f)
                horizontalLineToRelative(4.542f)
                quadToRelative(0.625f, 0f, 1.041f, 0.521f)
                quadToRelative(0.417f, 0.52f, 0.25f, 1.104f)
                quadToRelative(-0.125f, 0.458f, -0.479f, 0.729f)
                quadToRelative(-0.354f, 0.271f, -0.812f, 0.271f)
                horizontalLineToRelative(-5.209f)
                lineToRelative(-1.833f, 7.375f)
                horizontalLineToRelative(5.375f)
                quadToRelative(0.625f, 0f, 1.042f, 0.521f)
                quadToRelative(0.416f, 0.52f, 0.25f, 1.104f)
                quadToRelative(-0.125f, 0.458f, -0.48f, 0.729f)
                quadToRelative(-0.354f, 0.271f, -0.812f, 0.271f)
                horizontalLineToRelative(-6.042f)
                lineToRelative(-1.5f, 6f)
                quadToRelative(-0.083f, 0.375f, -0.375f, 0.666f)
                quadToRelative(-0.291f, 0.292f, -0.833f, 0.292f)
                quadToRelative(-0.625f, 0f, -1.021f, -0.479f)
                quadToRelative(-0.396f, -0.479f, -0.187f, -1.104f)
                lineToRelative(1.333f, -5.375f)
                horizontalLineToRelative(-7.417f)
                lineToRelative(-1.5f, 6f)
                quadToRelative(-0.083f, 0.375f, -0.375f, 0.666f)
                quadToRelative(-0.291f, 0.292f, -0.833f, 0.292f)
                close()
                moveToRelative(3.375f, -9.583f)
                horizontalLineToRelative(7.417f)
                lineToRelative(1.833f, -7.375f)
                horizontalLineToRelative(-7.417f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberCasino(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "casino",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.625f, 29.5f)
                quadToRelative(0.917f, 0f, 1.542f, -0.625f)
                reflectiveQuadToRelative(0.625f, -1.5f)
                quadToRelative(0f, -0.917f, -0.625f, -1.542f)
                reflectiveQuadToRelative(-1.542f, -0.625f)
                quadToRelative(-0.875f, 0f, -1.5f, 0.625f)
                reflectiveQuadToRelative(-0.625f, 1.542f)
                quadToRelative(0f, 0.875f, 0.625f, 1.5f)
                reflectiveQuadToRelative(1.5f, 0.625f)
                close()
                moveToRelative(0f, -14.708f)
                quadToRelative(0.917f, 0f, 1.542f, -0.625f)
                reflectiveQuadToRelative(0.625f, -1.542f)
                quadToRelative(0f, -0.875f, -0.625f, -1.5f)
                reflectiveQuadToRelative(-1.542f, -0.625f)
                quadToRelative(-0.875f, 0f, -1.5f, 0.625f)
                reflectiveQuadToRelative(-0.625f, 1.5f)
                quadToRelative(0f, 0.917f, 0.625f, 1.542f)
                reflectiveQuadToRelative(1.5f, 0.625f)
                close()
                moveTo(20f, 22.125f)
                quadToRelative(0.875f, 0f, 1.5f, -0.625f)
                reflectiveQuadToRelative(0.625f, -1.5f)
                quadToRelative(0f, -0.875f, -0.625f, -1.5f)
                reflectiveQuadToRelative(-1.5f, -0.625f)
                quadToRelative(-0.875f, 0f, -1.5f, 0.625f)
                reflectiveQuadToRelative(-0.625f, 1.5f)
                quadToRelative(0f, 0.875f, 0.625f, 1.5f)
                reflectiveQuadToRelative(1.5f, 0.625f)
                close()
                moveToRelative(7.375f, 7.375f)
                quadToRelative(0.875f, 0f, 1.5f, -0.625f)
                reflectiveQuadToRelative(0.625f, -1.5f)
                quadToRelative(0f, -0.917f, -0.625f, -1.542f)
                reflectiveQuadToRelative(-1.5f, -0.625f)
                quadToRelative(-0.917f, 0f, -1.542f, 0.625f)
                reflectiveQuadToRelative(-0.625f, 1.542f)
                quadToRelative(0f, 0.875f, 0.625f, 1.5f)
                reflectiveQuadToRelative(1.542f, 0.625f)
                close()
                moveToRelative(0f, -14.708f)
                quadToRelative(0.875f, 0f, 1.5f, -0.625f)
                reflectiveQuadToRelative(0.625f, -1.542f)
                quadToRelative(0f, -0.875f, -0.625f, -1.5f)
                reflectiveQuadToRelative(-1.5f, -0.625f)
                quadToRelative(-0.917f, 0f, -1.542f, 0.625f)
                reflectiveQuadToRelative(-0.625f, 1.5f)
                quadToRelative(0f, 0.917f, 0.625f, 1.542f)
                reflectiveQuadToRelative(1.542f, 0.625f)
                close()
                moveTo(7.875f, 34.75f)
                quadToRelative(-1.042f, 0f, -1.833f, -0.792f)
                quadToRelative(-0.792f, -0.791f, -0.792f, -1.833f)
                verticalLineTo(7.875f)
                quadToRelative(0f, -1.042f, 0.792f, -1.833f)
                quadToRelative(0.791f, -0.792f, 1.833f, -0.792f)
                horizontalLineToRelative(24.25f)
                quadToRelative(1.042f, 0f, 1.833f, 0.792f)
                quadToRelative(0.792f, 0.791f, 0.792f, 1.833f)
                verticalLineToRelative(24.25f)
                quadToRelative(0f, 1.042f, -0.792f, 1.833f)
                quadToRelative(-0.791f, 0.792f, -1.833f, 0.792f)
                close()
                moveToRelative(0f, -2.625f)
                horizontalLineToRelative(24.25f)
                verticalLineTo(7.875f)
                horizontalLineTo(7.875f)
                verticalLineToRelative(24.25f)
                close()
                moveToRelative(0f, -24.25f)
                verticalLineToRelative(24.25f)
                verticalLineToRelative(-24.25f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberDie(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "casino",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(md_theme_light_primary),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.625f, 29.5f)
                quadToRelative(0.917f, 0f, 1.542f, -0.625f)
                reflectiveQuadToRelative(0.625f, -1.5f)
                quadToRelative(0f, -0.917f, -0.625f, -1.542f)
                reflectiveQuadToRelative(-1.542f, -0.625f)
                quadToRelative(-0.875f, 0f, -1.5f, 0.625f)
                reflectiveQuadToRelative(-0.625f, 1.542f)
                quadToRelative(0f, 0.875f, 0.625f, 1.5f)
                reflectiveQuadToRelative(1.5f, 0.625f)
                close()
                moveToRelative(0f, -14.708f)
                quadToRelative(0.917f, 0f, 1.542f, -0.625f)
                reflectiveQuadToRelative(0.625f, -1.542f)
                quadToRelative(0f, -0.875f, -0.625f, -1.5f)
                reflectiveQuadToRelative(-1.542f, -0.625f)
                quadToRelative(-0.875f, 0f, -1.5f, 0.625f)
                reflectiveQuadToRelative(-0.625f, 1.5f)
                quadToRelative(0f, 0.917f, 0.625f, 1.542f)
                reflectiveQuadToRelative(1.5f, 0.625f)
                close()
                moveTo(20f, 22.125f)
                quadToRelative(0.875f, 0f, 1.5f, -0.625f)
                reflectiveQuadToRelative(0.625f, -1.5f)
                quadToRelative(0f, -0.875f, -0.625f, -1.5f)
                reflectiveQuadToRelative(-1.5f, -0.625f)
                quadToRelative(-0.875f, 0f, -1.5f, 0.625f)
                reflectiveQuadToRelative(-0.625f, 1.5f)
                quadToRelative(0f, 0.875f, 0.625f, 1.5f)
                reflectiveQuadToRelative(1.5f, 0.625f)
                close()
                moveToRelative(7.375f, 7.375f)
                quadToRelative(0.875f, 0f, 1.5f, -0.625f)
                reflectiveQuadToRelative(0.625f, -1.5f)
                quadToRelative(0f, -0.917f, -0.625f, -1.542f)
                reflectiveQuadToRelative(-1.5f, -0.625f)
                quadToRelative(-0.917f, 0f, -1.542f, 0.625f)
                reflectiveQuadToRelative(-0.625f, 1.542f)
                quadToRelative(0f, 0.875f, 0.625f, 1.5f)
                reflectiveQuadToRelative(1.542f, 0.625f)
                close()
                moveToRelative(0f, -14.708f)
                quadToRelative(0.875f, 0f, 1.5f, -0.625f)
                reflectiveQuadToRelative(0.625f, -1.542f)
                quadToRelative(0f, -0.875f, -0.625f, -1.5f)
                reflectiveQuadToRelative(-1.5f, -0.625f)
                quadToRelative(-0.917f, 0f, -1.542f, 0.625f)
                reflectiveQuadToRelative(-0.625f, 1.5f)
                quadToRelative(0f, 0.917f, 0.625f, 1.542f)
                reflectiveQuadToRelative(1.542f, 0.625f)
                close()
                moveTo(7.875f, 34.75f)
                quadToRelative(-1.042f, 0f, -1.833f, -0.792f)
                quadToRelative(-0.792f, -0.791f, -0.792f, -1.833f)
                verticalLineTo(7.875f)
                quadToRelative(0f, -1.042f, 0.792f, -1.833f)
                quadToRelative(0.791f, -0.792f, 1.833f, -0.792f)
                horizontalLineToRelative(24.25f)
                quadToRelative(1.042f, 0f, 1.833f, 0.792f)
                quadToRelative(0.792f, 0.791f, 0.792f, 1.833f)
                verticalLineToRelative(24.25f)
                quadToRelative(0f, 1.042f, -0.792f, 1.833f)
                quadToRelative(-0.791f, 0.792f, -1.833f, 0.792f)
                close()
                moveToRelative(0f, -2.625f)
                horizontalLineToRelative(24.25f)
                verticalLineTo(7.875f)
                horizontalLineTo(7.875f)
                verticalLineToRelative(24.25f)
                close()
                moveToRelative(0f, -24.25f)
                verticalLineToRelative(24.25f)
                verticalLineToRelative(-24.25f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberArrowBack(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "arrow_back",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(18.542f, 32.208f)
                lineTo(7.25f, 20.917f)
                quadToRelative(-0.208f, -0.209f, -0.292f, -0.438f)
                quadToRelative(-0.083f, -0.229f, -0.083f, -0.479f)
                quadToRelative(0f, -0.25f, 0.083f, -0.479f)
                quadToRelative(0.084f, -0.229f, 0.292f, -0.438f)
                lineTo(18.583f, 7.75f)
                quadToRelative(0.375f, -0.333f, 0.896f, -0.333f)
                reflectiveQuadToRelative(0.938f, 0.375f)
                quadToRelative(0.375f, 0.416f, 0.375f, 0.937f)
                quadToRelative(0f, 0.521f, -0.375f, 0.938f)
                lineToRelative(-9.042f, 9f)
                horizontalLineToRelative(19.917f)
                quadToRelative(0.541f, 0f, 0.916f, 0.395f)
                quadToRelative(0.375f, 0.396f, 0.375f, 0.938f)
                quadToRelative(0f, 0.542f, -0.375f, 0.917f)
                reflectiveQuadToRelative(-0.916f, 0.375f)
                horizontalLineTo(11.375f)
                lineToRelative(9.083f, 9.083f)
                quadToRelative(0.334f, 0.375f, 0.334f, 0.896f)
                reflectiveQuadToRelative(-0.375f, 0.937f)
                quadToRelative(-0.417f, 0.375f, -0.938f, 0.375f)
                quadToRelative(-0.521f, 0f, -0.937f, -0.375f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberCircle(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "circle",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20f, 36.375f)
                quadToRelative(-3.375f, 0f, -6.375f, -1.292f)
                quadToRelative(-3f, -1.291f, -5.208f, -3.521f)
                quadToRelative(-2.209f, -2.229f, -3.5f, -5.208f)
                quadTo(3.625f, 23.375f, 3.625f, 20f)
                quadToRelative(0f, -3.417f, 1.292f, -6.396f)
                quadToRelative(1.291f, -2.979f, 3.521f, -5.208f)
                quadToRelative(2.229f, -2.229f, 5.208f, -3.5f)
                reflectiveQuadTo(20f, 3.625f)
                quadToRelative(3.417f, 0f, 6.396f, 1.292f)
                quadToRelative(2.979f, 1.291f, 5.208f, 3.5f)
                quadToRelative(2.229f, 2.208f, 3.5f, 5.187f)
                reflectiveQuadTo(36.375f, 20f)
                quadToRelative(0f, 3.375f, -1.292f, 6.375f)
                quadToRelative(-1.291f, 3f, -3.5f, 5.208f)
                quadToRelative(-2.208f, 2.209f, -5.187f, 3.5f)
                quadToRelative(-2.979f, 1.292f, -6.396f, 1.292f)
                close()
                moveToRelative(0f, -2.625f)
                quadToRelative(5.75f, 0f, 9.75f, -4.021f)
                reflectiveQuadToRelative(4f, -9.729f)
                quadToRelative(0f, -5.75f, -4f, -9.75f)
                reflectiveQuadToRelative(-9.75f, -4f)
                quadToRelative(-5.708f, 0f, -9.729f, 4f)
                quadToRelative(-4.021f, 4f, -4.021f, 9.75f)
                quadToRelative(0f, 5.708f, 4.021f, 9.729f)
                quadTo(14.292f, 33.75f, 20f, 33.75f)
                close()
                moveTo(20f, 20f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberLooksOne(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "looks_one",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(21.708f, 28.292f)
                quadToRelative(0.542f, 0f, 0.938f, -0.396f)
                quadToRelative(0.396f, -0.396f, 0.396f, -0.938f)
                verticalLineTo(13.042f)
                quadToRelative(0f, -0.542f, -0.396f, -0.938f)
                quadToRelative(-0.396f, -0.396f, -0.938f, -0.396f)
                horizontalLineToRelative(-3.416f)
                quadToRelative(-0.542f, 0f, -0.917f, 0.396f)
                reflectiveQuadToRelative(-0.375f, 0.938f)
                quadToRelative(0f, 0.541f, 0.396f, 0.937f)
                reflectiveQuadToRelative(0.937f, 0.396f)
                horizontalLineToRelative(2.042f)
                verticalLineTo(27f)
                quadToRelative(0f, 0.542f, 0.396f, 0.917f)
                reflectiveQuadToRelative(0.937f, 0.375f)
                close()
                moveTo(7.875f, 34.75f)
                quadToRelative(-1.042f, 0f, -1.833f, -0.792f)
                quadToRelative(-0.792f, -0.791f, -0.792f, -1.833f)
                verticalLineTo(7.875f)
                quadToRelative(0f, -1.042f, 0.792f, -1.833f)
                quadToRelative(0.791f, -0.792f, 1.833f, -0.792f)
                horizontalLineToRelative(24.25f)
                quadToRelative(1.042f, 0f, 1.833f, 0.792f)
                quadToRelative(0.792f, 0.791f, 0.792f, 1.833f)
                verticalLineToRelative(24.25f)
                quadToRelative(0f, 1.042f, -0.792f, 1.833f)
                quadToRelative(-0.791f, 0.792f, -1.833f, 0.792f)
                close()
                moveToRelative(0f, -2.625f)
                horizontalLineToRelative(24.25f)
                verticalLineTo(7.875f)
                horizontalLineTo(7.875f)
                verticalLineToRelative(24.25f)
                close()
                moveToRelative(0f, -24.25f)
                verticalLineToRelative(24.25f)
                verticalLineToRelative(-24.25f)
                close()
            }
        }.build()
    }
}