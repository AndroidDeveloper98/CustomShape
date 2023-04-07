package com.innovation.customshape

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView
import com.google.android.material.shape.ShapePath
import com.google.android.material.shape.TriangleEdgeTreatment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView : MaterialCardView = findViewById<MaterialCardView>(R.id.cardView)

       /* cardView.shapeAppearanceModel = cardView.shapeAppearanceModel
            .toBuilder()
            .setTopEdge(object : TriangleEdgeTreatment(20F, false) {
                override fun getEdgePath(
                    length: Float, center: Float, interpolation: Float,
                    shapePath: ShapePath
                ) {
                    //...... your implementation
                }
            }
            )
            .build()*/

        cardView.shapeAppearanceModel = cardView.shapeAppearanceModel
            .toBuilder()
            .setTopEdge(TicketEdgeTreatment(120F))
            .build()

    }
}