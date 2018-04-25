package com.google.android.gms.samples.vision.barcodereader

import android.hardware.Camera

class ScannerOptions(focusMode: String,
                     flashMode: String,
                     barcodeFormats: Array<Int>,
                     cameraFacing: Int = Camera.CameraInfo.CAMERA_FACING_BACK,
                     fps: Float,
                     previewWidth: Int = 1600,
                     previewHeight: Int = 1024) {

}