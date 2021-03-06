package com.byteshaft.contactsharing.card;

import android.app.Activity;


public class CardDetailsActivity extends Activity {

//    private int cardId;
//    private CardsDatabase cardsDatabase;
//    private HashMap<String, String> cardData;
//    private TextView personName;
//    private TextView jobTitle;
//    private TextView phoneNumber;
//    private TextView emailAddress;
//    private TextView address;
//    private TextView organization;
//    private TextView jobzyId;
//    private ImageView cardImage;
//    private RelativeLayout mainLayout;
//    private String color;
//    private Uri imgUri;
//    private boolean isImage = false;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.card_one);
//        personName = (TextView) findViewById(R.id.tv_name);
//        jobTitle = (TextView) findViewById(R.id.job_title);
//        phoneNumber = (TextView) findViewById(R.id.phone_number);
//        emailAddress = (TextView) findViewById(R.id.email_address);
//        address = (TextView) findViewById(R.id.location);
//        organization = (TextView) findViewById(R.id.tv_organization);
//        jobzyId = (TextView) findViewById(R.id.tv_jobzy_id);
//        cardImage = (ImageView) findViewById(R.id.card_image);
//        mainLayout = (RelativeLayout) findViewById(R.id.main_layout);
//        cardsDatabase = new CardsDatabase(getApplicationContext());
//
//        cardId = getIntent().getIntExtra(AppGlobals.CARD_ID, 0);
//        color = getIntent().getStringExtra(AppGlobals.CURRENT_COLOR);
//        mainLayout.setBackgroundColor(Color.parseColor(color));
//        cardImage.setScaleType(ImageView.ScaleType.FIT_XY);
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        if (cardId == 0) {
//            finish();
//        } else {
//            Log.i("TAG", "" +cardsDatabase.getBusinessCard());
//            cardData = cardsDatabase.getBusinessCard();
//        }
//        if (cardData.get(AppGlobals.IS_IMAGE).equals("0")) {
//            personName.setText(cardData.get(AppGlobals.NAME));
//            jobTitle.setText(cardData.get(AppGlobals.JOB_TITLE));
//            phoneNumber.setText(cardData.get(AppGlobals.NUMBER));
//            emailAddress.setText(cardData.get(AppGlobals.EMAIL));
//            address.setText(cardData.get(AppGlobals.ADDRESS));
//            organization.setText(cardData.get(AppGlobals.ORG));
//            jobzyId.setText(cardData.get(AppGlobals.JOBZY_ID));
//
//            address.setTypeface(AppGlobals.regularTypeface);
//            personName.setTypeface(AppGlobals.regularTypeface);
//            jobTitle.setTypeface(AppGlobals.regularTypeface);
//            phoneNumber.setTypeface(AppGlobals.regularTypeface);
//            emailAddress.setTypeface(AppGlobals.regularTypeface);
//            organization.setTypeface(AppGlobals.regularTypeface);
//            jobzyId.setTypeface(AppGlobals.regularTypeface);
//        } else if (cardData.get(AppGlobals.IS_IMAGE).equals("1")) {
//            mainLayout.setBackgroundColor(Color.TRANSPARENT);
//            personName.setVisibility(View.GONE);
//            jobTitle.setVisibility(View.GONE);
//            phoneNumber.setVisibility(View.GONE);
//            emailAddress.setVisibility(View.GONE);
//            address.setVisibility(View.GONE);
//            organization.setVisibility(View.GONE);
//            jobzyId.setVisibility(View.GONE);
//            cardImage.setVisibility(View.VISIBLE);
//            imgUri = Uri.parse(cardData.get(AppGlobals.IMG_URI));
//            Bitmap bitmap = BitmapFactory.decodeFile(imgUri.getPath());
//            int height = 1920;
//            int width = 1080;
//            Bitmap scaled = Bitmap.createScaledBitmap(bitmap, height, width, true);
//            cardImage.setImageBitmap(scaled);
////            cardImage.setImageURI(imgUri);
//        }
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//
//                return true;
//        }
//        return super.onTouchEvent(event);
//    }
//
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        finish();
//    }
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.edit_button:
//                Intent editIntent = new Intent(CardDetailsActivity.this, BusinessForm.class);
//                editIntent.putExtra("id", cardId);
//                System.out.println(cardId);
//                startActivity(editIntent);
//                break;
//            case R.id.share_button:
//                JSONObject jsonObject = new JSONObject();
//                if (isImage) {
//                    try {
//                        jsonObject.put(AppGlobals.IS_IMAGE_SHARE, 1);
//                        jsonObject.put(AppGlobals.NAME, personName.getText().toString());
//                        jsonObject.put(AppGlobals.IMG_URI, cardData.get(AppGlobals.IMG_URI));
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                } else {
//                    try {
//                        jsonObject.put(AppGlobals.IS_IMAGE_SHARE, 0);
//                        jsonObject.put(AppGlobals.NAME, personName.getText().toString());
//                        jsonObject.put(AppGlobals.ADDRESS, address.getText().toString());
//                        jsonObject.put(AppGlobals.EMAIL, emailAddress.getText().toString());
//                        jsonObject.put(AppGlobals.JOB_TITLE, jobTitle.getText().toString());
//                        jsonObject.put(AppGlobals.ORG, organization.getText().toString());
//                        jsonObject.put(AppGlobals.JOBZY_ID, jobzyId.getText().toString());
//                        jsonObject.put(AppGlobals.NUMBER, phoneNumber.getText().toString());
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                }
//                finish();
//                Intent intent = new Intent(getApplicationContext(), BluetoothActivity.class);
//                intent.putExtra(AppGlobals.DATA_TO_BE_SENT, jsonObject.toString());
//                startActivity(intent);
//                break;
//        }
//
//    }
}
