# build container
FROM node:16.17-alpine as build
WORKDIR /app
COPY . ./
RUN npm ci --no-audit
RUN npm run build

# production container
FROM nginx:stable-alpine
COPY --from=build /app/build /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]