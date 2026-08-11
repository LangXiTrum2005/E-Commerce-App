package com.example.e_commercelaptop.user.welcome

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class CurvedBottomShape : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {

        val path = Path()

        path.moveTo(0f, 0f)
        path.lineTo(size.width, 0f)

        path.lineTo(
            size.width,
            size.height * 0.88f
        )

        path.quadraticBezierTo(
            size.width * 0.5f,
            size.height,
            0f,
            size.height * 0.88f
        )

        path.close()

        return Outline.Generic(path)
    }
}