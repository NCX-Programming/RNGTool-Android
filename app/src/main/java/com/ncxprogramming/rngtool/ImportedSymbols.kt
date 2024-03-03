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
fun rememberPlayingCards(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "playing_cards",
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
                moveTo(610.167f, -406.167f)
                lineToRelative(29.166f, -106f)
                quadToRelative(2.5f, -9.5f, -0.75f, -18.916f)
                quadToRelative(-3.25f, -9.417f, -11.916f, -15.084f)
                lineToRelative(-90.974f, -62.5f)
                quadTo(529f, -613.5f, 521.32f, -610.644f)
                quadToRelative(-7.68f, 2.857f, -9.763f, 11.232f)
                lineTo(482f, -493.5f)
                quadToRelative(-2.5f, 9.833f, 0.75f, 19.25f)
                quadToRelative(3.25f, 9.416f, 11.917f, 14.75f)
                lineToRelative(90.974f, 62.805f)
                quadToRelative(6.692f, 4.861f, 14.42f, 2.023f)
                quadToRelative(7.727f, -2.838f, 10.106f, -11.495f)
                close()
                moveToRelative(-417.5f, 230.668f)
                lineToRelative(-58.334f, -24f)
                quadToRelative(-31.716f, -13.169f, -42.774f, -46.109f)
                quadToRelative(-11.06f, -32.939f, 5.608f, -65.058f)
                lineToRelative(95.5f, -221.835f)
                verticalLineToRelative(357.002f)
                close()
                moveTo(336.5f, -112f)
                quadToRelative(-33.471f, 0f, -57.069f, -23.753f)
                quadToRelative(-23.597f, -23.753f, -23.597f, -57.08f)
                verticalLineToRelative(-290.335f)
                lineTo(383.001f, -138f)
                quadToRelative(2.833f, 7.667f, 6f, 13.75f)
                quadToRelative(3.167f, 6.084f, 8.667f, 12.25f)
                horizontalLineTo(336.5f)
                close()
                moveTo(520f, -132.167f)
                quadToRelative(-24.333f, 8.834f, -48.412f, -1.952f)
                quadToRelative(-24.079f, -10.785f, -32.921f, -34.881f)
                lineTo(252.833f, -676f)
                quadToRelative(-8.833f, -24.334f, 2.28f, -48.55f)
                quadToRelative(11.113f, -24.216f, 35.72f, -32.95f)
                lineToRelative(310.501f, -112f)
                quadToRelative(24.34f, -8.5f, 48.93f, 2.217f)
                quadToRelative(24.59f, 10.718f, 33.236f, 34.949f)
                lineTo(870.167f, -326f)
                quadToRelative(8.5f, 24.341f, -2.472f, 48.514f)
                quadToRelative(-10.972f, 24.173f, -34.861f, 32.653f)
                lineTo(520f, -132.167f)
                close()
                moveTo(498.5f, -192f)
                lineToRelative(310f, -112.666f)
                lineToRelative(-184.833f, -504.668f)
                lineToRelative(-309.834f, 112f)
                lineTo(498.5f, -192f)
                close()
                moveToRelative(62.833f, -309.167f)
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