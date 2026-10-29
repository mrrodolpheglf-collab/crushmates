# CrushMate — APK Android

Application Android (WebView) qui embarque l'app web CrushMate. Cible : Android 7 et plus, dont Android 12 et le Samsung Galaxy Note 20.

## Option 1 — Construire l'APK avec Android Studio (recommandé)

1. Installe **Android Studio** (version Koala ou plus récente) depuis developer.android.com.
2. Dans Android Studio : **File > Open** et sélectionne le dossier `CrushMate-android`.
3. Laisse Gradle synchroniser (première fois : quelques minutes).
4. Menu **Build > Build App Bundle(s) / APK(s) > Build APK(s)**.
5. Clique sur **locate** dans la notification : le fichier `app-debug.apk` est dans `app/build/outputs/apk/debug/`.

## Installer sur le Galaxy Note 20

1. Copie `app-debug.apk` sur le téléphone (câble USB, Google Drive, etc.).
2. Ouvre le fichier et autorise l'installation depuis cette source si Android le demande.
3. Ouvre **CrushMate**, puis va dans **Réglages** pour saisir ta clé API.

Pour un APK signé prêt à diffuser : **Build > Generate Signed App Bundle / APK**, puis crée une clé de signature.

## Personnaliser

- **Icône** : remplace `android:icon` dans `AndroidManifest.xml` par ton propre icône (Android Studio : clic droit sur `res` > New > Image Asset).
- **Nom de l'app** : `app/src/main/res/values/strings.xml`.
- **Contenu** : `app/src/main/assets/index.html` (c'est la version web de CrushMate).

## Points à connaître

- Les appels aux API d'IA partent directement de l'appareil. Certains fournisseurs peuvent refuser ces appels depuis une application : si « Tester » échoue alors que la clé est bonne, il faudra passer par un petit serveur intermédiaire.
- La dictée vocale (micro) n'est pas disponible dans la WebView ; le bouton reste masqué.
