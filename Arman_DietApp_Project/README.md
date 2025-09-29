
Arman Diet Tracker - Android Studio Project Skeleton
---------------------------------------------------

What you get:
- Minimal Android project skeleton with Room database and a DataSeeder that loads a meals.json asset (28-day plan entries).
- A GitHub Actions workflow (android.yml) included to build an APK when you push this repo to GitHub.

How to build locally:
1. Install Android Studio on your PC (Windows/Mac/Linux).
2. Open this folder as a project in Android Studio.
3. Let Android Studio download Gradle and required SDK tools.
4. Run the app on an emulator or device. Open app and tap 'Seed 28-day Plan' to insert meal entries into DB.

GitHub Actions CI (automatic APK build):
1. Create a new GitHub repo and push this project.
2. On GitHub, go to Actions tab, enable CI. The provided workflow will run on push and produce an APK artifact you can download.
3. Note: You may need to set up Android SDK licenses in the workflow (the included workflow already installs SDK components).

If you want, I can:
- Expand the app with full activities (Plan viewer, Grocery, Reminders) inside this project.
- Provide a signed release key (you must keep this secure) and a GitHub Actions secret to sign release APK.
