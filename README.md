This Android application using Jetpack Compose that fetches and displays a list of products from a remote API. The project demonstrates modern Android development practices, including the use of Retrofit for network calls, LiveData for reactive UI updates, and Jetpack Compose for building UI components.

Features:
Product Data Fetching:

Retrofit Integration: The application uses Retrofit to perform network requests to fetch product data from a remote API.
LiveData: The data is exposed to the UI layer via LiveData, ensuring the UI updates reactively as data changes.
MVVM Architecture:

ViewModel: Product data fetching logic is encapsulated within a ViewModel, following the MVVM architecture pattern to ensure a clean separation of concerns.
Repository: The repository pattern is implemented to manage data operations, allowing easy swapping of data sources (e.g., from network to local cache).
Jetpack Compose UI:

Composable Functions: The UI is built using Jetpack Compose, which simplifies UI development with a declarative approach.
LazyColumn: A LazyColumn is used to efficiently display the list of products.
Theming: Material3 theming is applied to ensure a consistent and modern look and feel across the app.
Mock Data Handling:

Dynamic List Items: Each product is displayed with its title, description, and price, styled using Material Design components to ensure readability and a clean appearance.
Implementation Details:
ApiService.kt: Defines the Retrofit service interface for fetching products from the API.
MainActivity.kt: The main activity that sets up the UI using Jetpack Compose and binds the ViewModel to the composable functions.
ProductRepository.kt: Manages data operations and serves as an abstraction layer over the data source.
ProductViewModel.kt: Encapsulates the product fetching logic and exposes the product list as LiveData.
ProductItem.kt: A composable function that defines the UI for each product item in the list.
