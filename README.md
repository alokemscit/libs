# libraries
Image Crop- Image Circle- Signature Pad
   
**********************for crop image------*****************

Add  in Manifest :
activity android:name="com.aloke.libraries.cropper.CropImageActivity"

Call Crop Activity:
                    CropImage.activity()
                    .setGuidelines( CropImageView.Guidelines.ON)
                   .setActivityTitle("Image Crop")
                    .setCropShape(CropImageView.CropShape.RECTANGLE)
                    .setCropMenuCropButtonTitle("Done")
                    .setRequestedSize(400, 400)
                    .setCropMenuCropButtonIcon(R.drawable.crop_image_menu_flip)
                    .start(this);
                    
******************  Fro Activity Result ********************************
@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        // handle result of CropImageActivity
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == RESULT_OK) {
                img.setImageURI(result.getUri());
                Toast.makeText(
                        this, "Cropping successful, Sample: " + result.getSampleSize(), Toast.LENGTH_LONG)
                        .show();
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                Toast.makeText(this, "Cropping failed: " + result.getError(), Toast.LENGTH_LONG).show();
            }
        }
    }
                    
                    
